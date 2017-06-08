package ua.com.juja.core;

/**
 * Created by avg-m on 08/06/2017.
 */
public class Salary {
    public static void main(String[] args) {
        System.out.println(countSalary(100, 10));
        System.out.println(countSalary(10, 100));
        System.out.println(countSalary(5, 10));
        System.out.println(countSalary(100, 50));
        System.out.println(countSalary(-5, 50));
        System.out.println(countSalary(100, -5));
        System.out.println(countSalary(-100, -5));
     //   System.out.println(countSalary(100, 10));

    }

    private static String countSalary(int hourSalary, int hours) {
        String result = "Зарплата";
        double salary;
        if (hourSalary<0 || hours <0 ) return  result+=" не может существовать :)";
        if (hourSalary < 8)
            return result += " не может быть меньше 8 долларов в час";
        if (hours > 60)
            return result += " не может быть такой большой (отработка >60 часов)";
        if (hours > 40) {
            salary = (1.5 * (hours - 40) + hours) * hourSalary;
            return result += " за отработанное время: " + salary;
        }
        else {
            salary=hours*hourSalary;
            return result += " за отработанное время: " + salary;
        }
    }
}
