package Demo2;

/**
 * @Author: KanZhou
 * @Date: 2023-02-18 5:27 p.m.
 */
public class Student {
    private String name;
    private int age;
    public static String classRoom;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getClassRoom() {
        return classRoom;
    }

    public static void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }
}
