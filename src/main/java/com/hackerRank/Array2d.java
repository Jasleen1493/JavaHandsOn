package com.hackerRank;

public class Array2d {
    static int diagonalDifference(int[][] arr) {
        return Math.abs(diagonal1Sum(arr) - diagonal2Sum(arr));
    }

    static int diagonal1Sum(int[][] arr) {
        int sum = 0;
        for (int i = 0, j = 0; i < arr.length; i++, j++)
            sum += arr[i][j];
        return sum;
    }

    static int diagonal2Sum(int[][] arr) {
        int sum = 0;
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--)
            sum += arr[i][j];
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{-1, 1, -7, -8},
                {-10, -8, -5, -2},
                {0, 9, 7, -1},
                {4, 4, -2, 1}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(diagonalDifference(arr));
    }
}
