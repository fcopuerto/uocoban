package edu.uoc.uocoban.model.entities.pathable;
import edu.uoc.uocoban.model.entities.movable.Box;
import edu.uoc.uocoban.model.entities.pathable.Mutable;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;
import edu.uoc.uocoban.model.entities.MapItem;


public abstract class Destination extends MapItem implements Mutable {

    private Box box;

    protected Destination(Position position, Sprite sprite) {
        super(position, sprite);
    }

    public Box getBox()
    {
        return box;
    }

    public void setBox(Box box)
    {
        this.box = box;
    }
    public boolean isEmpty()
    {
        return box == null;
    }
    public boolean isPathable()
    {
        return isEmpty();
    }
}
