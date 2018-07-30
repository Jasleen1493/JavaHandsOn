package com.thinking.in.java;

import java.lang.CharSequence;

interface a
{
        int abc = 10;

}
interface b {
    int abc = 100;
}
class c implements b,a{
    public void m(){
        System.out.println(a.abc);
    }
    public static void main(String[] args) {
new c().m();
System.out.println(b.abc);
    }
}