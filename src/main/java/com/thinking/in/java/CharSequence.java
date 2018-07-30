package com.thinking.in.java;

import java.util.Scanner;

/*
* Write a class that implements the CharSequence interface found in the java.lang package.
* Your implementation should return the string backwards. Select one of the sentences from this book to use as the data.
* Write a small main method to test your class; make sure to call all four methods.
*/
public class CharSequence implements java.lang.CharSequence{
    private String str;

    public CharSequence(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return this.str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}

class TestCharSequence {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("str = "+str);
        CharSequence ch = new CharSequence(str);
        System.out.println(ch);
    }
}
