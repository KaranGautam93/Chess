package board;

import board.pieces.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Board {
    ArrayList<ArrayList<Cell>> grid = new ArrayList<ArrayList<Cell>>();

    public Board() {
        createGrid();
        initWhites();
        initBlacks();
        printGrid();
    }

    private void createGrid() {
        int i = 1;
        char ch[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        for (i = 1; i <= 8; i++) {
            ArrayList<Cell> row = new ArrayList<Cell>();
            for (int j = 0; j < 8; j++) {
                row.add(new Cell(i, ch[j]));
            }
            grid.add(row);
        }
    }

    private void initWhites() {
        Piece Knight1 = new Knight(PieceColor.WHITE, PieceType.KNIGHT);
        Piece Knight2 = new Knight(PieceColor.WHITE, PieceType.KNIGHT);
        Piece pawn1 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece pawn2 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece pawn3 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece pawn4 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece pawn5 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece pawn6 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece pawn7 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece pawn8 = new Pawn(PieceColor.WHITE, PieceType.PAWN);
        Piece rook1 = new Rook(PieceColor.WHITE, PieceType.ROOK);
        Piece rook2 = new Rook(PieceColor.WHITE, PieceType.ROOK);
        Piece bishop1 = new Bishop(PieceColor.WHITE, PieceType.BISHOP);
        Piece bishop2 = new Bishop(PieceColor.WHITE, PieceType.BISHOP);
        Piece queen = new Queen(PieceColor.WHITE, PieceType.QUEEN);
        Piece king = new King(PieceColor.WHITE, PieceType.KING);

        setPosition(Knight1, 0, 1);
        setPosition(Knight2, 0, 6);
        setPosition(rook1, 0, 0);
        setPosition(rook2, 0, 7);
        setPosition(pawn1, 1, 0);
        setPosition(pawn2, 1, 1);
        setPosition(pawn3, 1, 2);
        setPosition(pawn4, 1, 3);
        setPosition(pawn5, 1, 4);
        setPosition(pawn6, 1, 5);
        setPosition(pawn7, 1, 6);
        setPosition(pawn8, 1, 7);
        setPosition(bishop1, 0, 2);
        setPosition(bishop2, 0, 5);
        setPosition(queen, 0, 3);
        setPosition(king, 0, 4);
    }

    private void initBlacks() {
        Piece Knight1 = new Knight(PieceColor.BLACK, PieceType.KNIGHT);
        Piece Knight2 = new Knight(PieceColor.BLACK, PieceType.KNIGHT);
        Piece pawn1 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece pawn2 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece pawn3 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece pawn4 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece pawn5 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece pawn6 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece pawn7 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece pawn8 = new Pawn(PieceColor.BLACK, PieceType.PAWN);
        Piece rook1 = new Rook(PieceColor.BLACK, PieceType.ROOK);
        Piece rook2 = new Rook(PieceColor.BLACK, PieceType.ROOK);
        Piece bishop1 = new Bishop(PieceColor.BLACK, PieceType.BISHOP);
        Piece bishop2 = new Bishop(PieceColor.BLACK, PieceType.BISHOP);
        Piece queen = new Queen(PieceColor.BLACK, PieceType.QUEEN);
        Piece king = new King(PieceColor.BLACK, PieceType.KING);

        setPosition(Knight1, 7, 1);
        setPosition(Knight2, 7, 6);
        setPosition(rook1, 7, 0);
        setPosition(rook2, 7, 7);
        setPosition(pawn1, 6, 0);
        setPosition(pawn2, 6, 1);
        setPosition(pawn3, 6, 2);
        setPosition(pawn4, 6, 3);
        setPosition(pawn5, 6, 4);
        setPosition(pawn6, 6, 5);
        setPosition(pawn7, 6, 6);
        setPosition(pawn8, 6, 7);
        setPosition(bishop1, 7, 2);
        setPosition(bishop2, 7, 5);
        setPosition(queen, 7, 3);
        setPosition(king, 7, 4);
    }

    private void setPosition(Piece piece, int row, int column) {
        Cell cell = grid.get(row).get(column);
        cell.setPiece(piece);
    }

    public void printGrid() {
        Iterator<ArrayList<Cell>> iterator = grid.iterator();
        while (iterator.hasNext()) {
            Iterator<Cell> cellIterator = iterator.next().iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cell.getPiece() != null) {
                    System.out.print(cell.getPiece().getColor().toString() + "-" + cell.getPiece().getType().toString() + "\t");
                } else {
                    System.out.print("--\t\t\t\t");
                }
            }
            System.out.println();
        }
    }

    public void makeMove(int startRow, int startCol, int endRow, int endCol) {
        //add calls for making moves here

        //print grid after
        printGrid();
    }
}
