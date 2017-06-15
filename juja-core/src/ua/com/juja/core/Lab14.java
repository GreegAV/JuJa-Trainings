package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab14 {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier <arr.length - 1; barrier++) {
            for (int index = barrier; index >=0;  index--) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        }
    }
}