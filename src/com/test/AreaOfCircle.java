package com.test;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		// Area = pi * r ^ 2  where pi = 3.14159  r= radius
		
		double area,radius;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle");
		radius = scan.nextDouble();
		
		scan.close();
		
		area = Math.PI * radius * radius;
		
		System.out.println("area of the Circle is "+area);
		
		

	}

}
