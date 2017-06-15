package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab07 {
    public static byte swapBits(byte b, int i, int j) {
        byte first = (byte) (((1 << i) & b) >> i);
        byte second = (byte) ((((1 << j) & b)) >> j);

        byte a = (byte) b;

        if ( first != second ) {
            if ( first == 1 ) {
                first <<= j;

                a = (byte) (b | first);
                a ^= (1 << i);
            } else {
                second <<= i;
                a = (byte) (b | second);
                a ^= (1 << j);
            }
        }

        return a;
    }
}
