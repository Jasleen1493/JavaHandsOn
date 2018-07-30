package com.hackerRank;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Series {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] s = new int[n];
            s[0] =  (int) (a + pow(2,0)*b);
            System.out.print(s[0] + " ");
            for (int j = 1; j < n ; j++) {
                s[j]= s[j-1]+(int) ((pow(2,j))*b);
                System.out.print(s[j] + " ");
            }
        }

    /*    Scanner in1 = new Scanner(System.in);
        int t1=in.nextInt();
        int a[]=new int[t];
        int b[]=new int[t];
        int n[]=new int[t];
        int s[] = new int[t];
        for(int i=0;i<t;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
            s[0] =  (int) (a[i] + pow(2,0)*b[i]);
            for (int j = 1; j < n[i] ; j++) {
                s[j]= s[j-1]+(int) ((pow(2,j))*b[i]);
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }*/

        in.close();
    }

}
