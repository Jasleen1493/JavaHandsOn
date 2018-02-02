package com.thinking.in.java;

import java.util.Scanner;

class X
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}

class Y extends X
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
       // Y.staticMethod();
      //  Y y = new Y();
        //X x = new Y();
        //x.staticMethod();
        //y.staticMethod();

       // ClassTwo two = new ClassTwo();
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("s = "+s);
    }
}

class ClassOne
{
    static int i = 111;

    int j = 222;

    {
        i = i++- ++j;
        System.out.println(i);
    }

}

class ClassTwo extends ClassOne
{
    Scanner in = new Scanner(System.in);

    String s = in.nextLine();

    {
       // j = i– + –j;
        System.out.println(j);
    }
}
