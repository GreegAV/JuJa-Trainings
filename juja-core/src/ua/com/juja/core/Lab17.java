package ua.com.juja.core;

/*
 Скопипастил и нихрена не понял :(
 */
import java.util.Stack;

public class Lab17 {
    public static void exchange(Stack<Integer> from, Stack<Integer> help, Stack<Integer> to, int count) {
        if (count > 0){
            exchange(from,to,help,count-1); // перенести башню из n−1 диска на 2-й штырь
            int biggest = from.pop();
            to.push(biggest); // переносим самый большой диск на 3-й штырь
            exchange(help,from,to,count-1); // перенеси башню из n−1 диска на 3-й штырь
        }
    }
}
