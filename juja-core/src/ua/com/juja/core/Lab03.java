package ua.com.juja.core;

/**
 * Created by avg-m on 15/06/2017.
 */
public class Lab03 {

    // start from 1
    public static String getMonthOfYear(int number) {
        String mon="";
        switch (number){
            case 1: mon="january";break;
            case 2: mon="february";break;
            case 3: mon="march";break;
            case 4: mon="april";break;
            case 5: mon="may";break;
            case 6: mon="june";break;
            case 7: mon="july";break;
            case 8: mon="august";break;
            case 9: mon="september";break;
            case 10: mon="october";break;
            case 11: mon="november";break;
            case 12: mon="december";break;
            default: break;

        }
        return mon;
    }
}
