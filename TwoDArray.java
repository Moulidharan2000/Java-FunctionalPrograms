package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int rows = scan.nextInt();
		System.out.print("Enter the Number of Columns : ");
		int columns = scan.nextInt();
		int [][] numbers = new int[rows][columns];
		System.out.println("Enter the Numbers");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				numbers[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(numbers[i][j]+" in "+(Object)numbers.getClass().getSimpleName()+" ");
			}
			System.out.println();
		}
	}
}
