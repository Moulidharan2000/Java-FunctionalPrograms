package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
	
	static void Root(double a, double b, double c) {
		
		double delta = (b*b) - (4*a*c);
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1 of X : "+x1);
		System.out.println("Root 2 of X : "+x2);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Value for a : ");
		double a = scan.nextDouble();
		
		System.out.print("Enter the Value for b : ");
		double b = scan.nextDouble();
		
		System.out.print("Enter the Value for c : ");
		double c = scan.nextDouble();	
		
		Root(a, b, c);
	}
}
