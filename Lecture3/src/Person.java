/**
 * @Author: KanZhou
 * @Date: 2023-01-18 2:16 p.m.
 */
public class Person {
    public Person(){};
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;
    public void sayHello() {
        System.out.println("Hello! My name is " + name);
    }
    public void sayMyself() {
        System.out.println("My age is" + age);
    }
}
