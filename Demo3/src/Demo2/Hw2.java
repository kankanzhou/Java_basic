package Demo2;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 8:47 p.m.
 */
public class Hw2 {
    //-10.8 - 5.9    2.1 --- 6
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = -10; i <= 5; i++) {
            if (2.1 > Math.abs(i) || Math.abs(i) > 6) {
                cnt++;
                System.out.println(i);
            }
        }
        System.out.println(cnt);
    }
}
