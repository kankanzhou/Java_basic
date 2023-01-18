/**
 * @Author: KanZhou
 * @Date: 2023-01-18 2:38 p.m.
 */
public class Student extends Person{
    @Override
    public void sayHello() {
        System.out.println("I am a good student");
    }
    public void sayMyself(int age) {
        System.out.println("my name is" + age);
    }
    boolean isGood(int score) {return score > 90;}
}
