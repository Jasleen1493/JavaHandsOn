package com.thinking.in.java.holding.objects;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Collection<Integer> c2 = new HashSet<>();
    }
}
class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
}
