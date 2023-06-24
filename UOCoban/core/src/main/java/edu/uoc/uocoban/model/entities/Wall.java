package edu.uoc.uocoban.model.entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import edu.uoc.uocoban.model.utils.Sprite;

import javax.swing.text.Position;

public class Wall extends MapItem {

    public Wall(Position position) {
        super(Sprite.WALL, position);
    }

    public boolean isPathable() {
        return false;
    }
}
