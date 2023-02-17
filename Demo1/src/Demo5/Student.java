package Demo5;

/**
 * @Author: KanZhou
 * @Date: 2023-02-16 3:25 p.m.
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public Student() {
    }

    public Student(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
