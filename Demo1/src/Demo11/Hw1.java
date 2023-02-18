package Demo11;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: KanZhou
 * @Date: 2023-02-17 4:09 p.m.
 */
public class Hw1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            res.add(r.nextInt(1, 34));
        }
        System.out.println(res);
        Person p1 = new Person("a", 1);
        Person p2 = new Person("b", 2);
        ArrayList<Person> res1 = new ArrayList<>();
        res1.add(p1);
        res1.add(p2);
        for (int i = 0; i < res1.size(); i++) {
            System.out.println(res1.get(i).getName());
        }
    }
}
