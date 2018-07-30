package com.hackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("s = " +s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("####");
        decimalFormat = new DecimalFormat("000");
        for(int i1=0;i1<3;i1++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String y= decimalFormat.format(x);
            String padded = String.format("%1$-20s", s1);
            System.out.print(padded);
            System.out.print(y);
            System.out.println();
        }
    }


}
