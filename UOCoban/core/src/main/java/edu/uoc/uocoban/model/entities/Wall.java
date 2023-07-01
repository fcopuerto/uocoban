package edu.uoc.uocoban.model.entities;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;
import edu.uoc.uocoban.model.entities.MapItem;


public class Wall extends MapItem {

    public Wall(Position position)
    {
        super(position,Sprite.WALL);
    }

    public boolean isPathable() {
        return false;
    }
}
