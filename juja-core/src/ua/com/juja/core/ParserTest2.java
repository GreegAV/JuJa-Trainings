package ua.com.juja.core;

/**
 * Created by avg-m on 08/06/2017.
 */
public class ParserTest2 {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + Parser_stolen.eval("123"));
        System.out.println(">> 2*3 = " + Parser_stolen.eval("2*3"));
        System.out.println(">> (123+321)-1 = "+ Parser_stolen.eval("(123+321)-1"));
        System.out.println(">> (1+3)*2 = " + Parser_stolen.eval("(1+3)*2"));
        System.out.println(">> ((13/6)*2-5)+1 = " + Parser_stolen.eval("((13/6)*2-5)+1"));
    }
}