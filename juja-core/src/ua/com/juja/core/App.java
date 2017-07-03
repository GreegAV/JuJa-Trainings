package ua.com.juja.core;

public class App {
    public static int counter = 0;
    public final int id = counter++;

    public static void main(String[] args) {
        App app0 = new App();
        App app1 = new App();
        App app2 = new App();
        System.out.println(app2.id);
        System.out.println(app0.id);
        System.out.println(app2.counter);
        System.out.println(app0.counter);
        // System.out.println(App.id);
        System.out.println(App.counter);
        System.out.println(counter);
       // System.out.println(id);

    }
}
