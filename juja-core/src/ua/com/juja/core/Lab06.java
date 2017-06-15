package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab06 {
    public static int rightShift(int arg) {
        int min = 1;
        int max = 0b10000000_00000000_00000000_00000000;
        int result = arg >> 1;

        if ( max == (max & arg) ) {
            result = (result ^ max);
        }
        if ( min == (min & arg) ) {
            result = (result | max);
        }

        return result;
    }
}
