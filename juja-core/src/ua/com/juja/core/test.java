package ua.com.juja.core;

public class test {
    public static void main(String[] args) {

        String string = "1*(6+(5+4)+75)-2*3";
        System.out.println(eval(string));
    }
        public static int eval (String expression){
            return eval(expression,0,expression.length());
    }

    private static int eval(String expres, int from, int to) {

            if ((expres.indexOf('(')>-1) && (expres.lastIndexOf(')')>0)) {
                 eval(expres.substring(expres.indexOf('(')+1,expres.lastIndexOf(')')),
                         expres.indexOf('('),
                         expres.lastIndexOf(')'));
            } else {
                System.out.println(expres);//do math
            }

        return 999; //Integer.valueOf(expr.substring(from, to));
    }





    }
