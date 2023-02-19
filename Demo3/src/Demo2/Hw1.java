package Demo2;

import java.util.Arrays;


public class Hw1 {
    public static void main(String[] args) {
        String s = "kaiqwweh12983719(((^^^^";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}
