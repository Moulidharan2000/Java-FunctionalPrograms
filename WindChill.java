package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {

	static void CalculateChill(double temp, double speed) {
		
		if(temp < 50 && speed > 3 && speed < 120) {
			double windChill = 35.74 + (0.6215*temp) + (((0.4275*temp)-35.75)*(Math.pow(speed, 0.16)));
			System.out.println("The Value of Wind Chill is : "+windChill);
		}
		else if(temp > 50)
			System.out.println("The Temperature Value is Invalid !!!");
		else
			System.out.println("The Speed Value is Invalid !!!");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Value for Temperature : ");
		double temp = scan.nextDouble();
		
		System.out.print("Enter the Value for Wind Speed : ");
		double speed = scan.nextDouble();
		
		CalculateChill(temp, speed);
		
	}
}
