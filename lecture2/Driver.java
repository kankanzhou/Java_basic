public class Driver {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(1, 1, 2, 2);
        Rectangle rec1 = new Rectangle(2, 2, 2, 2);
        rec.overlap(rec1);
    }
}