package edu.uoc.uocoban.model.utils;

public enum Sprite {
    BIG_BOX('B', "big_box.png"),
    BIG_BOX_DESTINATION('D', "big_box_destination.png"),
    BIG_BOX_ON_DESTINATION('Q', "big_box_on_destination.png"),
    PATH('.', "path.png"),
    PLAYER('P', "player.png"),
    SMALL_BOX('S', "small_box.png"),
    SMALL_BOX_DESTINATION('X', "small_box_destination.png"),
    SMALL_BOX_ON_DESTINATION('Y', "small_box_on_destination.png"),
    WALL('#';"wallpng");

    private final char symbol;
    private final String imageSrc;

    Sprite(char symbol, String imageSrc) {
        this.symbol = symbol;
        this.imageSrc = imageSrc;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getImageSrc() {
        return imageSrc;
    }
}
