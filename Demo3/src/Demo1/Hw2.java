package Demo1;

import java.util.Scanner;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 2:44 p.m.
 */
public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] res = new int[4];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') res[0]++;
            else if ('A' <= c && c <= 'Z') res[1]++;
            else if('0' <= c && c <= '9') res[2]++;
            else res[3]++;
        }
        System.out.println("The length of this array is : " + s.length());
        for (int i = 0; i < res.length; i++) {
            if (i == 0) {
                System.out.println("UpperCase: " + res[0]);
            } else if (i == 1) {
                System.out.println("LowwerCase: " + res[1]);
            } else if (i == 2) {
                System.out.println("digits: " + res[2]);
            } else {
                System.out.println("Others: " + res[3]);
            }
        }
    }
}
