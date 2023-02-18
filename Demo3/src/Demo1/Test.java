package Demo1;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 1:31 p.m.
 */
public class Test {
    public static void main(String[] args) {
        char[] c = new char[]{ '1', '2', '3' };
        byte[] b = new byte[]{ 100, 99, 97 };
        String s = new String(c);
        String s1 = new String(b);
        System.out.println(s);
        System.out.println(s1);
    }
}
