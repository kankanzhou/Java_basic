package Demo1;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 1:43 p.m.
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        char[] s3 = { 'a', 'b', 'c' };
        String s4 = new String(s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s2 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s1.equals("abc"));
        System.out.println("abc".equals(s2));
        System.out.println("ABC".equalsIgnoreCase(s1));
    }
}
