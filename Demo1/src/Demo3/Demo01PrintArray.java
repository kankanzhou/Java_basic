package Demo3;

import java.util.Arrays;
import Demo3.Student;
/**
 * @Author: KanZhou
 * @Date: 2023-02-16 2:48 a.m.
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Student stu = new Student();
        System.out.println(Arrays.toString(array));
        stu.name = "zhoukan";
        stu.age = 20;
        stu.myAge();
    }
}

