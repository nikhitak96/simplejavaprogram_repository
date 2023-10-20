package com.test;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		double length,breadth,area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle");
		length = scan.nextDouble();
		
		System.out.println("Enter the breadth of Rectangle");
		breadth = scan.nextDouble();
		
		scan.close();
		
		area = length * breadth;
		
		System.out.println("Area of Rectangle "+area);
		
		

	}

}
