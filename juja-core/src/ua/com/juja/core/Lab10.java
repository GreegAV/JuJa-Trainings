package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab10 {
    public static int[] merge(int[] fst, int[] snd) {
        /*BODY*/
        int res[]=new int[fst.length+snd.length];
        int c1=0, c2=0,c3=0;

        while (c3<=fst.length+snd.length-1)
        {
            while ((c1<fst.length) && (c2<snd.length)) {
                if (fst[c1] <= snd[c2]) {
                    res[c3++] = fst[c1++];
                } else {
                    res[c3++] = snd[c2++];
                }
            }
            if (c1==fst.length) {
                for (int i = c2; i < snd.length; i++) {
                    res[c3++] = snd[i];
                }
            }
            else {
                for (int i = c1; i < fst.length; i++) {
                    res[c3++] = fst[i];
                }
            }
        }
        return res;
    }
}