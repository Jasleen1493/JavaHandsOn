package com.thinking.in.java.Polymorphism;

public class Exercise11 {
    public static void main(String[] args) {
        new Sandwich();
    }
}
class Meal {
    Meal() { System.out.println("Meal()"); }
}
class Bread {
    Bread() { System.out.println("Bread()"); }
}
class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}
class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
    public Lunch lunch = new Lunch();
    protected Meal meal = new Meal();
    PortableLunch() { System.out.println("PortableLunch()");}
}
class Pickle { Pickle(){
    System.out.println("Pickle()");}}
class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() {
        System.out.println("Sandwich()"); }
}