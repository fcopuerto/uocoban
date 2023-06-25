package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.Level;
import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.utils.Direction;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public  class Player extends MovableEntity {
    public Player(Position position, Level level)
    {
        super(position,Sprite.PLAYER,level);
    }

    /* Tries to move the player to the adjacent position determined by direction. A player moves according to the following rules:
    A player can only move to a position occupied by a Path or a Box that can be moved.
    If the target position is occupied by a Path, the player can always be moved to that position. In this context: (1) the original position of the player must be replaced with a Path; (2) the Path item to which the player is moving to must be removed; and (3) the Player position must be updated.
    If the target position is occupied by a Box, the player tries to move the box. If the box is successfully moved, then: (1) the original position of the player must be replaced with a Path; and (2) the Player position must be updated. Otherwise, the player does not move.
     */
    public boolean move(Direction direction)
    {
        boolean result;
        Position pos =getPosition();
        pos.setX(pos.getX()+direction.getX());
        pos.setY(pos.getY()+direction.getY());
        MapItem item  = getLevel().getMapItem(pos);
        if (item != null) {
            result = false;
        }
        else if (item instanceof Box) {
            result = false;
        }
        else if (item.isPathable()) {
            getLevel().removeMapItem(item);
            setPosition(pos);
            result = true;
        }
        else {
            setPosition(pos);
            result = true;
        }
        return result;
    }


    @Override
    public boolean isPathable() {
        return false;
    }
}
