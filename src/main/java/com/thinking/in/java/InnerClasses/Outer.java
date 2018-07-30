package com.thinking.in.java.InnerClasses;

public class Outer {
    int a = 10;
    static int b= 20;
    class Inner{
        public void m1(){
            System.out.println("Inner class method");
        }

        public void m2(){
            System.out.println("a = " +a + " b = "+b);
        }
    }
    public static void main(String[] args) {

        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        Outer.Inner i2 = new Outer().new Inner();   // without creation of

        new Outer().new Inner().m2();


    }
}
