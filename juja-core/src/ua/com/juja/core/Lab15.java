package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab15 {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int min = arr[barrier];
            int minindex = barrier;

            for (int index = barrier + 1; index < arr.length; index++) {
                if (min>arr[index]) {
                    min=arr[index];
                    minindex=index;
                }
            }
            swap(arr,minindex,barrier);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int tmp = arr[second];
        arr[second] = arr[first];
        arr[first] = tmp;
    }
}

