package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {

	static void calculation(int x, int y) {
		double calculate = Math.sqrt(Math.pow(x ,2)+Math.pow(y ,2));
		System.out.println("Distance from origin(0,0) and ("+x+","+y+") is "+calculate);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the X : ");
		int x = scan.nextInt();
		
		System.out.print("Enter the Y : ");
		int y = scan.nextInt();
		
		calculation(x, y);
	}
}
