package com.thinking.in.java.Polymorphism;

import java.util.Random;

/* Exercise4 2: (1) Add the @Override annotation to the shapes example. */
public class Exercise2 {
    private static RandomGenerator gen =
            new RandomGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        // Fill up the array with shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // Make polymorphic method calls:
        for(Shape shp : s)
            shp.draw();
    }
}

class Shape {

    public void draw() {
    }

    public void erase() {
    }
}

class Circle extends Shape {
   @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    @Override public void draw() {  System.out.println("Triangle.draw()"); }
    @Override public void erase() {  System.out.println("Triangle.erase()"); }
}

class RandomGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}

