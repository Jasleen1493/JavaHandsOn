package com.thinking.in.java;

public interface Interface {
    void m1();
    void m2();
    void m3();
}

class InterfaceImpl implements Interface{

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        Interface i = new InterfaceImpl();
        i.m1();
        i.m2();
        i.m3();
    }
}

abstract class Test1 implements Interface{
    public void m1() {
        System.out.println("m1 method");
    }
}
abstract class Test2 extends Test1{
    public void m2() {
        System.out.println("m2 method");
    }
}
class TestInterface extends Test2{
    public void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.m1();
        t.m2();
        t.m3();
    }
}

