package ua.com.juja.core;

public class ParserTest1 {
    public static void main(String[] args) {
        System.out.println(">> 123 = " + Parser1.eval("123"));
        System.out.println(">> 2*3 = " + Parser1.eval("2*3"));
        System.out.println(">> 2*(1+3) = " + Parser1.eval("2*(1+3)"));
        System.out.println(">> 1+(5-2*(13/6)) = " + Parser1.eval("1+(5-2*(13/6))"));
    }
}