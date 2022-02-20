package board;

import board.pieces.Piece;

public class Cell {
    private int row;
    private char column;

    private Piece piece;

    public Cell(int row, char column) {
        this.row = row;
        this.column = column;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
