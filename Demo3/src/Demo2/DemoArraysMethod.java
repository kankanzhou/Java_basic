package Demo2;

import java.util.Arrays;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 8:28 p.m.
 */
public class DemoArraysMethod {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 2, 3, -1 };
        Arrays.sort(arr);
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
