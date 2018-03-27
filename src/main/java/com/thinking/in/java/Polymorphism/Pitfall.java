package com.thinking.in.java.Polymorphism;

public class Pitfall {
    public static void main(String[] args) {
        Base b = new Derived();
        b.print();

        Derived d = new Derived();
        d.print();

       // print();          -- doesn't allow, it asks which one
    }
}
class Base{
    public static void print(){
        System.out.println("BAse");
    }
}
class Derived extends Base {public static void print(){
    System.out.println("Derived");
}}
