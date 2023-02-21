package Demo3;

/**
 * @Author: KanZhou
 * @Date: 2023-02-20 11:34 p.m.
 */
public class Zi extends Fu {
    int num = 254;
    public void method() {
        int num = 1000;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
