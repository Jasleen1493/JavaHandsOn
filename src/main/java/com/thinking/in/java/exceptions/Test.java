package com.thinking.in.java.exceptions;

import java.io.IOException;

public class Test {
    public  String toString(){
        System.out.println("Test toString called");
        return "";
    }

        public static void main(String[] args) {

            int x = 10*20-20;
            char c = 65;
            System.out.println(c);
            try {
                throw new IOException("Hello");
            }catch(IOException e) {
                System.out.print(e.getMessage());
            } catch(Exception e) {
                System.out.print(e.getMessage());
            } finally {
                System.out.println("World");
            }
        }
    }
interface Foo{
    int x = 10;
}