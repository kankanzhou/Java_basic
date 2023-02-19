package Demo2;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 5:28 p.m.
 */
public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("zhoukan", 19);
        Student.setClassRoom("Room1");
        System.out.println(Student.classRoom);
        Student.setClassRoom("Room2");
        System.out.println(Student.classRoom);
    }
}
