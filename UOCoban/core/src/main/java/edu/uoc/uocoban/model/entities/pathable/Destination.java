package edu.uoc.uocoban.model.entities.pathable;

import com.badlogic.gdx.graphics.g2d.Sprite;
import edu.uoc.uocoban.model.entities.MapItem;

import javax.swing.text.Position;

public class Destination extends MapItem {

    public Destination(Position position) {
        super(Sprite., position);
    }

    public boolean isPathable() {
        return true;
    }
}
