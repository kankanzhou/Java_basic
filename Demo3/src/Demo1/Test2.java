package Demo1;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 2:04 p.m.
 */
public class Test2 {
    public static void main(String[] args) {
        String s = "JUST for test";
        String s1 = s;
        s = s.concat("jjjj");
        System.out.println(s.length());
        System.out.println(s.concat("jsss"));
        System.out.println(s + "jjj");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.indexOf("s"));
    }
}
