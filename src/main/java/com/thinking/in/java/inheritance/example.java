package com.thinking.in.java.inheritance;

public class example {
    public static void main(String[] args)
    {
        C1 c = new C1();

      //  System.out.println(c.s);
    }
}
class A1
{
    String s = "Class A";
    static
    {
        System.out.println("THIRD");
    }
    public A1()
    {
        System.out.println("Class A Constructor");
    }
}

class B1 extends A1
{
    String s = "Class B";

    {
        System.out.println(super.s);
    }
    static
    {
        System.out.println("SECOND");
    }
    public B1()
    {
        System.out.println("Class B Constructor");
    }
}

class C1 extends B1
{
    String s = "Class C";

    {
        System.out.println(super.s);
    }
    static
    {
        System.out.println("FIRST");
    }
    public C1()
    {
        System.out.println("Class C Constructor");
    }
}
