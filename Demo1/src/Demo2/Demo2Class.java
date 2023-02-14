package Demo2;

/**
 * @Author: KanZhou
 * @Date: 2023-02-13 7:45 p.m.
 */
public class Demo2Class {
    public static void printArray(int[] array) {
        System.out.println("=================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=================");
    }

    public static int[] cal(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] arr = new int[2];
        arr[0] = sum;
        arr[1] = avg;
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {5, 15, 1, 20, 10};
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        int[] arr = cal(1, 2, 3);
        printArray(arr);
    }
}
