package com.hackerEarth;

import java.util.Scanner;

public class Divisors {
    public static int countDivisors(int l, int r, int k) {
        int count = 0;
        for (int x = l; x <= r; x++) {
            if (x % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(countDivisors(l, r, k));

    }
}
