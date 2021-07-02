import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayTask {
    public static void task1(int[] arr1){
        int total = 0;

        for (int a : arr1) {
            total += a;
        }
        System.out.println(total);
    }
    public static void task2(int[][] arr2) {
        int total2 = 0;
        for (int a = 0; a < arr2.length; a++) {
            for (int b : arr2[a]) {
                total2 += b;
            }
        }
        System.out.println(total2);
    }
    public static void task3(int[][] arr2) {
        int total2 = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int a = 0; a < arr2.length; a++) {
            total2 = 0;
            for (int b : arr2[a]) {
                total2 += b;
            }
            arr.add(a, total2);
        }
        for (int c : arr) {
            System.out.println(c);
        }
    }
    public static void main(String args[]) {
        int[] arr1 = {1, 5, 3};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6},{13,15,2}};

        task1(arr1);
        task2(arr2);
        task3(arr2);
    }
}

