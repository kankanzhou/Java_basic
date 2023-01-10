public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle (int x, int y, int width, int height) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("The value should be postive");
        }
        this.x = x;
        this.y = y;
    }
    public boolean overlap(Rectangle other) {
        return other.x < this.x;
    }
}