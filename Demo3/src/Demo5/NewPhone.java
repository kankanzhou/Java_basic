package Demo5;

/**
 * @Author: KanZhou
 * @Date: 2023-02-20 11:58 p.m.
 */
public class NewPhone extends OldPhone {
    @Override
    public void showNumber() {
        super.showNumber();
        System.out.println("test");
    }
}
