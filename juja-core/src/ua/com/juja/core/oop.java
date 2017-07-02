package ua.com.juja.core;

class Parent{
    protected void print(){
        System.out.println("Напечатано из класса родителя");
    }
}
class Child1 extends Parent{
    @Override
    protected void print(){
        System.out.println("Напечатано из наследника 1");
    }
}
class Child2 extends Parent{
    @Override
    protected void print(){
        System.out.println("Напечатано из наследника 2");
    }
}
class Child3 extends Parent{
    @Override
    protected void print(){
        System.out.println("Напечатано из наследника 3");
    }
}
public class oop {
    public static void main(String[] args) {
        Parent[] arrayParent = {new Parent(), new Child1(), new Child2(), new Child3()};
        for (Parent temp : arrayParent) {
            temp.print();
        }
    }
}
