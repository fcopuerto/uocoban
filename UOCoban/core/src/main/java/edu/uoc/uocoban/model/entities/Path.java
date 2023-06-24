package edu.uoc.uocoban.model.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;

import javax.swing.text.Position;

public class Path extends MapItem {

    public Path(Position position) {
        super(Sprite.PATH, position);
    }

    public boolean isPathable() {
        return true;
    }
}
