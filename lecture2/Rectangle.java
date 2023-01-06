public class Rectangle {
    private int x;
    private int y;
    public Rectangle (int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("The value should be postive");
        }
    }
}