package edu.uoc.uocoban.model.entities.pathable;


import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public class Path extends edu.uoc.uocoban.model.entities.MapItem {

    public Path(Position position) {
        super( position, Sprite.PATH);
    }

    public boolean isPathable() {
        return true;
    }
}
