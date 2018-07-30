package com.thinking.in.java;

public class Inheritance {
    Inheritance(){
        System.out.println(this.hashCode());
    }
}
class ChildClass extends Inheritance{
    ChildClass(){
        System.out.println(this.hashCode());
    }
}
class Test{
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        System.out.println(c.hashCode());
    }
}

