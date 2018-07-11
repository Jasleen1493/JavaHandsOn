package com.thinking.in.java.Polymorphism;

/* Create an inheritance hierarchy of Rodent:Mouse, Gerbil, Hamster, etc. In the
* base class, provide methods that are common to all Rodents, and override these
* in the derived classes to perform different behaviors depending on the
* specific type of Rodent. Create an array of Rodent, fill it with different
* specific types of Rodents, and call your base-class methods to see what
* happens.
*/
public class Exercise9 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for (Rodent rodent :rodents){
            System.out.println(rodent);
            rodent.eat();
            rodent.run();
            rodent.sleep();
        }
    }
}

class Rodent {
    public void eat() {
        System.out.println("Rodent.eat()");
    }

    public void run() {
        System.out.println("Rodent.run()");
    }

    public void sleep() {
        System.out.println("Rodent.sleep()");
    }

    @Override
    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {

    @Override
    public void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    public void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse.sleep()");
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}

class Gerbil extends Rodent {
    @Override
    public void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    public void run() {
        System.out.println("Gerbil.run()");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil.sleep()");
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}

class Hamster extends Rodent {
    @Override
    public void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    public void run() {
        System.out.println("Hamster.run()");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster.sleep()");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}

