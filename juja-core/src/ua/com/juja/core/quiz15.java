package ua.com.juja.core;








//quiz15.24
class Parent {
    static String first() {
        return second();
    }
    static String second() {
        return "Parent";
    }
}
class Child extends Parent {
    static String first() {
        return second();
    }
    static String second() {
        return "Child";
    }
}
class Test {
    public static void main(String[] args) {
        Parent ref = new Child();
        System.out.println(ref.first());
    }
}

//quiz15.23
//class Parent {
//    static String first() {
//        return second();
//    }
//    static String second() {
//        return "Parent";
//    }
//}
//
//class Child extends Parent {
//    static String first() {
//        return second();
//    }
//    static String second() {
//        return "Child";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.22
//abstract class A {
//    String first() {return second();}
//    abstract String second();
//    static String third() {return "A";}
//}
//class B extends A {
//    String second() {return third();}
//}
//class C extends B {
//    static String third() {return "C";}
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new C().first());
//    }
//}

//quiz15.21
//abstract class A {
//    String first() {return second();}
//    abstract String second();
//    String third() {return "A";}
//}
//class B extends A {
//    String second() {return third();}
//}
//class C extends B {
//    String third() {return "C";}
//}
//class Test {
//    public static void main(String[] args) {
//        B ref = new C();
//        System.out.println(ref.first());
//    }
//}

//quiz15.20
//abstract class A {
//    String first() {return second();}
//    abstract String second();
//    String third() {return "A";}
//}
//class B extends A {
//    String second() {return third();}
//}
//class C extends B {
//    String third() {return "C";}
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new C().first());
//    }
//}

//quiz15.19
//abstract class A {
//    String first() {return second();}
//    abstract String second();
//    String third() {return "A";}
//}
//class B extends A {
//    String second() {return third();}
//}
//class C extends B {
//    String third() {return "C";}
//}
//class Test {
//    public static void main(String[] args) {
//        A ref = new B();
//        System.out.println(ref.first());
//    }
//}

//quiz15.18
//abstract class A {
//    String first() {return second();}
//    abstract String second();
//    String third() {return "A";}
//}
//class B extends A {
//    String second() {return third();}
//}
//class C extends B {
//    String third() {return "C";}
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new B().first());
//    }
//}

//quiz15.17
//abstract class Parent {
//    String first() {
//        return second();
//    }
//    abstract String second();
//    static String third() {
//        return "Parent";
//    }
//}
//
//class Child extends Parent {
//    String second() {
//        return third();
//    }
//    static String third() {
//        return "Child";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.16
//abstract class Parent {
//    String first() {
//        return second();
//    }
//    abstract String second();
//    String third() {
//        return "Parent";
//    }
//}
//class Child extends Parent {
//    String second() {
//        return third();
//    }
//    String third() {
//        return "Child";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}


//quiz15.15
//class Parent {
//    static String first() {
//        return second();
//    }
//    static String second() {
//        return "Parent";
//    }
//}
//class Child extends Parent {
//    static String second() {
//        return "Child";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.14
//class Parent {
//    static String first() {
//        return second;
//    }
//    static String second = "Parent";
//}
//class Child extends Parent {
//    static String second = "Child";
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.13
//class Parent {
//    static String first() {
//        return second();
//    }
//    String second() {
//        return "Parent";
//    }
//}
//class Child extends Parent {
//    String second() {
//        return "Child";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.12
//class Parent {
//    static String first() {
//        return second;
//    }
//    String second = "Parent";
//}
//class Child extends Parent {
//    String second = "Child";
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.11
//class Parent {
//    String first() {
//        return second();
//    }
//    static String second() {
//        return "Parent";
//    }
//}
//class Child extends Parent {
//    static String second() {
//        return "Child";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.10
//class Parent {
//    String first() {
//        return second;
//    }
//    static String second = "Parent";
//}
//class Child extends Parent {
//    static String second = "Child";
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.9
//class Parent {
//    String first() {
//        return second();
//    }
//    String second() {
//        return "Parent";
//    }
//}
//class Child extends Parent {
//    String second() {
//        return "Child";
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.8
//class Parent {
//    String first() {
//        return second;
//    }
//
//    String second = "Parent";
//}
//
//class Child extends Parent {
//    String second = "Child";
//}
//
//class Test {
//    public static void main(String[] args) {
//        System.out.println(new Child().first());
//    }
//}

//quiz15.7
//class Parent {
//    Parent(int i) {
//        System.out.println("Parent(int)");
//    }
//}
//class Child extends Parent {
//    Child() {
//        System.out.println("Child()");
//    }
//    Child(int i) {
//        System.out.println("Child(int)");
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        new Child(0);
//    }
//}


//quiz15.6
//class Parent {
//    Parent() {
//        System.out.println("Parent()");
//    }
//    Parent(int i) {
//        System.out.println("Parent(int)");
//    }
//}
//class Child extends Parent {
//    Child() {
//        System.out.println("Child()");
//    }
//    Child(int i) {
//        System.out.println("Child(int)");
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        new Child(0);
//    }
//}

//quiz15.5
//class Parent {
//    Parent() {
//        System.out.println("Parent()");
//    }
//    Parent(int i, int j) {
//        System.out.println("Parent(int,int)");
//    }
//}
//class Child extends Parent {
//    Child() {
//        System.out.println("Child()");
//    }
//    Child(int i) {
//        System.out.println("Child(int)");
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        new Child(0,0);
//    }
//}


//quiz15.4
//class ParentMessage {
//    static String call = "Parent";
//}
//class ChildMessage extends ParentMessage {
//    static String call = "Child";
//}
//class Test {
//    public static void main(String[] args) {
//        send(new ChildMessage());
//    }
//    public static void send(ParentMessage msg) {
//        System.out.println(msg.call);
//    }
//}

//quiz15.3
//class ParentMessage {
//    String call = "Parent";
//}
//class ChildMessage extends ParentMessage {
//    String call = "Child";
//}
//class Test {
//    public static void main(String[] args) {
//        send(new ChildMessage());
//    }
//    public static void send(ParentMessage msg) {
//        System.out.println(msg.call);
//    }
//}

//quiz15.2
//class ParentMessage {
//    static void call() {
//        System.out.println("Parent");
//    }
//}
//class ChildMessage extends ParentMessage {
//    static void call() {
//        System.out.println("Child");
//    }
//}
//class Test {
//    public static void main(String[] args) {
//        send(new ChildMessage());
//    }
//    public static void send(ParentMessage msg) {
//        msg.call();
//    }
//}

//quiz15.1
//class ParentMessage {
//    void call() {
//        System.out.println("Parent");
//    }
//}
//class ChildMessage extends ParentMessage {
//    void call() {
//        System.out.println("Child");
//    }
//}
// class quiz151 {
//    public static void main(String[] args) {
//        send(new ChildMessage());
//    }
//    public static void send(ParentMessage msg) {
//        msg.call();
//    }
//}