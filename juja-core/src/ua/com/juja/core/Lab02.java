package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab02 {
    public static String printPurchases(boolean hasEggs, boolean hasBread) {
       /*BODY*/
        String buys = "";
        if (hasEggs && hasBread)
            buys=  "Eggs,Bread";
        if (!hasEggs && hasBread)
            buys=  "Bread";
        if (hasEggs && !hasBread)
            buys= "Eggs";
        if (!hasEggs && !hasBread)
            buys= "";

        return buys;
    }
}
