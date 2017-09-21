package com.puzzles.problems;

//lesson6/triangle_pattern
//
//Write nested loops that make the following pattern of brackets
//(Use the numberOfRows variable so it can easily be modified
//to print any number of rows): 
//[]
//[][]
//[][][]
//[][][][]
//[][][][][]

//If numberOfRows were 6, the pattern would be: 
//[]
//[][]
//[][][]
//[][][][]
//[][][][][]
//[][][][][][]

public class TrianglePattern {
	public static void main(String[] args)
 {
     // Please do not modify this line. 
     int numberOfRows = 6;
     for(int rowCounter = 0; rowCounter < numberOfRows; rowCounter++){
    	 for(int colCounter =0;colCounter <= rowCounter; colCounter++){
    		 System.out.print("[]");
    	 }
    	 System.out.println();
     }
 }
}
