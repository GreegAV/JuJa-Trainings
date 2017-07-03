package ua.com.juja.core;

//quiz14p22
public class App {
    public static int a = 0;
    public int b = 0;

    public App() {
        this.b = a++;
    }
    public static int get() {
        // return a + new App().b;
        // return new App().b + a;
        // return a++ + a++;
        //return b++ + b++;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
    }
}

//quiz14.p21
 class App2 {
    public static int a;
    public int b;
    public int c;

    public App2() {
        a++;
        b++;
        c = a + b;
    }
    public static void main(String[] args) {
//        App app0 = new App();
//        System.out.println(app0.a);
//        App app1 = new App();
//        System.out.println(app1.b);
//        App app2 = new App();
//        System.out.println(app2.c);

//        App app0 = new App();
//        System.out.println(app0.c);
//        App app1 = new App();
//        System.out.println(app1.b);
//        App app2 = new App();
//        System.out.println(app2.a);

//        App app0 = new App();
//        System.out.println(app0.a);
//        App app1 = new App();
//        System.out.println(app1.a);
//        App app2 = new App();
//        System.out.println(app2.a);

//        App app0 = new App();
//        System.out.println(app0.c);
//        App app1 = new App();
//        System.out.println(app1.c);
//        App app2 = new App();
//        System.out.println(app2.c);

    }
}

//quiz14.p1
 class App1 {
    public static int counter = 0;
    public final int id = counter++;

    public static void main(String[] args) {
        App1 app0 = new App1();
        App1 app1 = new App1();
        App1 app2 = new App1();
        System.out.println(app2.id);
        System.out.println(app0.id);
        System.out.println(app2.counter);
        System.out.println(app0.counter);
        // System.out.println(App.id);
        System.out.println(App1.counter);
        System.out.println(counter);
       // System.out.println(id);

    }
}

