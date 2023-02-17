package Demo6;

import java.util.Scanner;

/**
 * @Author: KanZhou
 * @Date: 2023-02-17 11:21 a.m.
 */
public class Ios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int num = sc.nextInt();
        int res;
        System.out.println("Pls input numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        res = num1 > num2 ? num1 : num2;
        int num3 = sc.nextInt();
        res = res > num3 ? res : num3;
        System.out.println(res);
    }
}
