package ua.com.juja.core;

/**
 * Created by avg-m on 11/06/2017.
 */
public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {
        if ( fst == null || snd == null  || fst[0].length != snd.length ) {
            throw new IllegalArgumentException();
        }

        int[][] result = new int[fst.length][snd[0].length];
        int rows = result.length;
        int columns = result[0].length;

        for ( int i = 0; i < rows; i++ ) {
            for ( int j = 0; j < columns; j++ ) {
                for ( int k = 0; k < fst[0].length; k++ ) {
                    result[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }
        return result;
    }
}