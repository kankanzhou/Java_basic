package Demo4;

/**
 * @Author: KanZhou
 * @Date: 2023-02-16 3:18 a.m.
 */
import Demo4.Phone;
public class Main {
    public static void main(String[] args) {
        Phone iphone = getPhone();
        iphone.call();
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        return one;
    }
}
