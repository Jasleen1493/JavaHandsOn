package com.thinking.in.java.Interfaces;

/*
* Exercise 1: (1) Modify Exercise 9 in the previous chapter so that Rodent is an abstract
* class. Make the methods of Rodent abstract whenever possible.
* */
public class Exercise1 {
}

abstract class Rodent {
    public void eat() {
        System.out.println("Rodent.eat()");
    }

    public void run() {
        System.out.println("Rodent.run()");
    }

    public void sleep() {
        System.out.println("Rodent.sleep()");
    }

    abstract public void action();

    @Override
    public String toString() {
        return "Rodent";
    }
}
class Mouse extends Rodent{             // Learning !! - either class should be abstract or implement the abstract method

    public void action(){

    }
}