package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab05 {
    public static int leftShift(int arg) {
        int result = arg << 1;
        int x = 0b10000000_00000000_00000000_00000000;

        if ( x == (x & arg) ) {
            result += 1;
        }

        return result;
    }
}
