package Demo1;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 2:24 p.m.
 */
public class Test4 {
    public static void main(String[] args) {
        String s = "zhoukan";
        char[] c = s.toCharArray();
        byte[] b = s.getBytes();
        System.out.println(s);
        System.out.println(b[0]);
        System.out.println(c);
        String s1 = s.replace("z", "k");
        System.out.println(s1);
    }
}
