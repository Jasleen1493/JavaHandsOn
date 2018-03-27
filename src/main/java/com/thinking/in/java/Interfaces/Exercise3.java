package com.thinking.in.java.Interfaces;

public class Exercise3 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.print();
    }
}
abstract class Base{
    abstract void print();
    Base(){
        print();
    }
}
class Derived extends Base{         // either the class needs to be declared as abstract or all abstract methods needs to be implemented

    int var = 67;

    @Override
    public void print()
    {
        System.out.println("Derived class "+ var );
    }
}