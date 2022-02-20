package board.pieces;

import board.Cell;

abstract public class Piece {
    protected PieceType type;
    protected PieceColor color;
    protected boolean active = true;

    public PieceColor getColor() {
        return color;
    }


    public PieceType getType() {
        return type;
    }


    public boolean isActive() {
        return active;
    }

    public Piece(PieceColor color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    abstract void move();
}
