package edu.uoc.uocoban.model.entities;

import edu.uoc.uocoban.model.utils.Sprite;

public class Wall extends MapItem {

    public Wall(Position position)
    {
        super(Sprite.WALL, position);
    }

    public boolean isPathable()
    {

    }
}
