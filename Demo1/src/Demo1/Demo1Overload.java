package Demo1;

public class Demo1Overload {
    public static boolean compare(int a, int b) {
        System.out.println("two integers");
        return a == b;}
    public static boolean compare(short a, short b) {return a == b;}
    public static boolean compare(byte a, byte b) {return a == b;}
    public static boolean compare(long a, long b) {return a == b;}
    public static void main(String[] args) {
        System.out.println(compare(1, 1));
        System.out.println(compare((byte) 1000, (byte) 2000));
        System.out.println(compare(1L, 1L));
        System.out.println(compare((short) 1, (short) 1));

    }
}
