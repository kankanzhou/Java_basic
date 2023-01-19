/**
 * @Author: KanZhou
 * @Date: 2023-01-18 5:31 p.m.
 */
enum color {
    BLACK, WHITE
}
public interface ChessPiece {
    int getRow();
    int getColumn();
    color getColor();
    boolean canMove(int row, int col, color c);
    boolean canKill(ChessPiece piece);
}
