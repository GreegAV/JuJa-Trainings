package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab08 {
    public static void invert(int[] arr) {
        for ( int k = arr.length / 2 - 1; k >= 0; k-- ) {
            int temp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = temp;
        }
    }
}
