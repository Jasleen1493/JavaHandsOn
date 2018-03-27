package com.thinking.in.java.classes.objects;

public class Example {
    public static void main(String[] args) {
        Integer  i = new Integer(12);
        Integer j = new Integer(12);
        System.out.println(i ==j);
        String a ="abc";
        String b = "abc";
        System.out.println(a == b);

        Integer q=127;
        Integer r =127;
        System.out.println(q ==r);
        Integer.valueOf(10);

        int i1 = new Integer(10);
        System.out.println("**"+i1);


    }
}
