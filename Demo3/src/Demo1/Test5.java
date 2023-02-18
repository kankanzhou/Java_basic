package Demo1;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 2:31 p.m.
 */
// split . should be \\.
public class Test5 {
    public static void main(String[] args) {
        String s = "zhou,kanzh,ouka,n";
        String[] s1 = s.split(",");
        for (String z : s1) System.out.println(z);
    }
}
