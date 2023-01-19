/**
 * @Author: KanZhou
 * @Date: 2023-01-18 5:42 p.m.
 */
public class Bishop implements ChessPiece {
    private int row;
    private int col;
    private color c;
    Bishop(int row, int col, color c) {
        this.row = row;
        this.col = col;
        this.c = c;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return col;
    }
    public color getColor() {
        return c;
    }
    public boolean canMove(int row1, int col1, color c1) {
        return true;

    }
    public boolean canKill(ChessPiece piece) {
        return true;
    }
}
