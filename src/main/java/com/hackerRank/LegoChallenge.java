package com.hackerRank;

import java.util.Scanner;

public class LegoChallenge {

    static int productOfLegoTypes(int a, int b, int c, int d, int p, int q) {

        return ((a*b*c*d)/(p*q));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, a, b, c, d, p, q, r, s;
        t = sc.nextInt();
        System.out.println("t = "+t);
        for (int i = 0; i < t ; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();
            System.out.println(productOfLegoTypes(a,b,c,d,p,q));
        }
    }
}
