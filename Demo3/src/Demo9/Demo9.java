package Demo9;

/**
 * @Author: KanZhou
 * @Date: 2023-02-25 1:51 p.m.
 */

public interface Demo9 {
    void methodAbs();
    default void name() {
        System.out.println("jjj");
    }
    public static void show() {
        System.out.println("show name");
    }
}
