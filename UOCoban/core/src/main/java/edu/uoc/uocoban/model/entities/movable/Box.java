package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.entities.pathable.BigBoxDestination;
import edu.uoc.uocoban.model.entities.pathable.Destination;
import edu.uoc.uocoban.model.entities.pathable.SmallBoxDestination;
import edu.uoc.uocoban.model.utils.Direction;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;
import edu.uoc.uocoban.model.Level;

public abstract class Box extends MovableEntity {
    private boolean delivered;

    protected Box(Position position, Sprite sprite, Level level) {
        super(position, sprite, level);
        setDelivered(false);
    }

    private void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public boolean isPathable() {
        return false;
    }

    /*A box can only move to a Path or a Destination of the same type that the box (i.e., a BigBox cannot move to a SmallBoxDestination; a SmallBox cannot move to a BigBoxDestination).
    A box cannot move to a Destination map item that is already occupied by another box.
    If a box is moving to a Path map item, then (1) the Path is removed from the level map; and (2) the position of the Box is updated.
    If a box is moving to a valid Destination map item, then (1) the Box is removed from the level map; (2) the Box is marked as delivered (i.e., delivered = true; and (3) the Box is assigned to the Destination.
    */
    public boolean move(Direction direction) {
        boolean result = false;
        Position pos = new Position(getPosition().getX(), getPosition().getY());
        pos.setX(pos.getX() + direction.getX());
        pos.setY(pos.getY() + direction.getY());
        MapItem item = getLevel().getMapItem(pos);
        if (item != null) {
            //Check If a box is moving to a Path map item, then (1) the Path is removed from the level map; and (2) the position of the Box is updated.
            if (item.isPathable()) {
                getLevel().removeMapItem(item);
                result = true;
            } else {
                //A box can only move to a Path or a Destination of the same type that the box (i.e., a BigBox cannot move to a SmallBoxDestination; a SmallBox cannot move to a BigBoxDestination)
                if ((this instanceof SmallBox) & (item instanceof BigBoxDestination)) {
                    result = false;
                }
                else if ((this instanceof BigBox) & (item instanceof SmallBoxDestination)) {
                    result = false;
                }else {
                    result = true;
                }
                // Check  A box cannot move to a Destination map item that is already occupied by another box.
                if (result && (item instanceof Destination)) {
                    result = ((Destination) item).isEmpty();
                }
                // Check If a box is moving to a valid Destination map item, then (1) the Box is removed from the level map; (2) the Box is marked as delivered (i.e., delivered = true; and (3) the Box is assigned to the Destination.
                if (result && (item instanceof Destination)) {
                    if (((Destination) item).isEmpty()) {
                        this.setDelivered(true);
                        getLevel().removeMapItem(item);
                        result = true;
                    }
                }
            }
        }
        if (result)
            setPosition(pos);
        return result;
    }
}
