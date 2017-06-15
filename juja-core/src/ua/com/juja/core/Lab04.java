package ua.com.juja.core;

public class Lab04 {

    public static String getDayOfTheWeek(int dayNum){
       /*BODY*/
        String day="";
        switch (dayNum){
            case 1: day="Monday";break;
            case 2: day="Tuesday";break;
            case 3: day="Wednesday";break;
            case 4: day="Thursday";break;
            case 5: day="Friday";break;
            case 6: day="Saturday";break;
            case 7: day="Sunday";break;

            default: break;
        }
        return day;
    }
}
