package edu.uoc.uocoban.model.entities;

import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public abstract class MapItem {

    private Position position;
    private Sprite sprite;

    public MapItem(Position position, Sprite sprite)
    {
        setPosition(position);
        setSprite(sprite);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public abstract boolean isPathable();
}
