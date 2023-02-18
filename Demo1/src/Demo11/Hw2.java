package Demo11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: KanZhou
 * @Date: 2023-02-17 4:19 p.m.
 */
public class Hw2 {
    public static void printArrayList(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (i != arr.size() - 1) {
                System.out.print(arr.get(i) + "@");
            } else {
                System.out.print(arr.get(i));
            }
        }
        System.out.println("}");

    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("kkkk");
        arr.add("ssss");
        arr.add("asda");
        printArrayList(arr);
    }
}
