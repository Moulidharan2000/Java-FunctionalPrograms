package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumofThreeIntegers {
	
	static void Triplets(int [] numbers, int size) {
		boolean found = false;
		for(int i=0; i<size-2; i++) {
			for(int j=i+1; j<size-1; j++) {
				for(int k=j+1; k<size; k++) {
					if(numbers[i] + numbers[j] + numbers[k] == 0) {
						System.out.println(numbers[i]+" "+
										   numbers[j]+" "+
										   numbers[k]+" ");
						found = true;
					}
				}
			}
		}
		if(found == true)
			System.out.println("Triplets Found!!!");
		else
			System.out.println("Triplets Not Found!!!");
	}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size = scan.nextInt();
		int [] numbers = new int[size]; 
		System.out.println("Enter the Numbers !!!");
		
		for(int i=0; i<size; i++) {
			numbers[i]=scan.nextInt();
		}
		for(int i=0; i<size; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
		Triplets(numbers, size);
	}

}
