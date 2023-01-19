/**
 * @Author: KanZhou
 * @Date: ${DATE} ${TIME}
 */
public class Board {
    public static void main(String[] args) {
        Bishop bishop = new Bishop(0, 0, color.BLACK);
        System.out.println(bishop.canKill(bishop));
    }
}