package com.thinking.in.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        int intInput = sc.nextInt();
        float floatInput = sc.nextFloat();
        System.out.println(stringInput + "\n" + intInput);
        System.out.printf("%.2f", floatInput);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());
    }
}

