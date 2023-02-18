package Demo1;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 2:37 p.m.
 */
public class Hw1 {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 2, 3, 4, 5 };
        System.out.println(getString(arr));
    }
    public static String getString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) s += "word" + arr[i] + "#";
            else s += "word" + arr[i] + "]";
        }
        return s;
    }
}
