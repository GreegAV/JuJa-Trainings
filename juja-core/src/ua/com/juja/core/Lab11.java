package ua.com.juja.core;

public class Lab11 {
    public static int lookFor(int max) {
        int limit, counter=0;

        limit=(int)Math.sqrt((double)max-1);
        for (int i = 1; i <=limit ; i++) {
            for (int j = 1; j <=limit ; j++) {
                if (i*i+j*j <=max) counter++;
            }
        }
        return counter;/*BODY*/
    }
}  