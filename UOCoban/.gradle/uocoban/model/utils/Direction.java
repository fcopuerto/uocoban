package edu.uoc.uocoban.model.utils;

public enum Direction {

    RIGHT (1,0, 22),
    DOWN(0,1, 20),
    LEFT (-1, 0, 21),
    UP(0,1,19);

    private final int x;
    private final int y;
    private final int keyCode;

    Direction(int x,int y,int keyCode) {
        this.x = x;
        this.y = y;
        this.keyCode = keyCode;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getKeyCode() { return keyCode; }

}
