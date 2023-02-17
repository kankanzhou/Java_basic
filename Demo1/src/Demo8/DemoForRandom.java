package Demo8;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: KanZhou
 * @Date: 2023-02-17 11:58 a.m.
 */
public class DemoForRandom {
    public static void main(String[] args) {
        int target = new Random().nextInt(1, 101);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pls input a number");
            int num = sc.nextInt();
            if (num == target) {
                System.out.println("GameOver");
                break;
            } else if (num > target) System.out.println("Bigger than target");
            else System.out.println("Smaller than target");
        }
    }
}
