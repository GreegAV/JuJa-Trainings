package ua.com.juja.core;

/**
 Реализуйте метод rotateClockwise(int[][]) класса ArrayUtils, который
 1) проверяет, что метод получил "квадратную" матрицу (допустимые размеры 1x1, 2x2, 3x3, ...) иначе возвращать null;
 (возможные ошибки: null вместо массива, одна из размерностей = 0, длина не равна ширине, есть строки разной длины,
 есть строки с null вместо одномерных массивов)
 2) "проворачивает" массив по часовой стрелке на 90 градусов, т.е
 [1] -> [1]
 [[1, 2], [3, 4]] -> [[3, 1], [4, 2]]
 [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> [[7, 4, 1], [8, 5, 2], [9, 6, 3]] ...

 */
public class ArrayUtils {

    public static void main(String[] argv)
    {
        int m = 6;
        String[][] a = new String[m][m];
        // fill matrix
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                a[i][j] =""+i+j;
            }
        }
        // print
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print(" "+ a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        a=rotateClockwise(a);
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print(" "+ a[i][j]);
            }
            System.out.print("\n");
        }
    }


    public static String[][] rotateClockwise(String[][] arg) {
        String tmp[][] = new String[arg.length][arg[0].length];

        for (int i = 0; i <arg.length ; i++) {
            for (int j = 0; j < arg[0].length ; j++) {
                tmp[i][j]=arg[j][i];
            }
        }

        for (int i = 0; i <tmp.length ; i++) {
            for (int j = 0; j < tmp[0].length ; j++) {
                arg[i][j]=tmp[i][tmp.length-j-1];
            }
        }

        return arg;
    }
}
