package Demo5;

/**
 * @Author: KanZhou
 * @Date: 2023-02-16 3:30 p.m.
 */
public class Person {
    private String name;
    private int age;
    public Person(){
        System.out.println("Begin");
    };
    public Person(String name, int age) {
        System.out.println("end");
        this.name = name;
        this.age = age;
    }
}
