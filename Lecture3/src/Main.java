/**
 * @Author: KanZhou
 * @Date: ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Person woman = new Person();
        Person man = new Person("kan", 20);
        Student wei = new Student();
        man.sayHello();
        wei.sayHello();
        wei.sayMyself();
        wei.sayMyself(20);
    }
}