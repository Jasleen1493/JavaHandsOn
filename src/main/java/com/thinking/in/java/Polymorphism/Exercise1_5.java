package com.thinking.in.java.Polymorphism;

/* Exercise1_5 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
Exercise3 5: (1) Starting from Exercise3 1, add a wheels( ) method in Cycle, which
returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
polymorphism works.*/


import static com.thinking.in.java.Polymorphism.Cycle.ride;

public class Exercise1_5 {
    public static void main(String[] args) {
        Cycle u = new Unicycle();
        ride(u);
        Cycle b = new Bicycle();
        ride(b);
        Cycle t = new Tricycle();
        ride(t);
    }
}

class Cycle {
    private String name = "Cycle";
    private int wheels = 0;

    public static void ride(Cycle c) {
        System.out.println("Ride " + c + " ,which has " + c.wheels() + " wheels");
    }

    public int wheels() {
        return this.wheels;
    }

    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int wheels = 1;

    @Override
    public int wheels() {
        return this.wheels;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int wheels() {
        return this.wheels;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int wheels = 3;

    @Override
    public int wheels() {
        return this.wheels;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
