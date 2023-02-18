package Demo11;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: KanZhou
 * @Date: 2023-02-17 4:28 p.m.
 */
public class Hw3 {
    public static ArrayList<Integer> classifyArrayList(ArrayList<Integer> array) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 == 0) res.add(array.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            arr.add(r.nextInt(1, 101));
        }
        System.out.println(arr);
        System.out.println(classifyArrayList(arr));
    }
}
