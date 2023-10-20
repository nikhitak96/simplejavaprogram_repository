package com.test;

import java.util.Scanner;

public class AddingTwoNumber {

	public static void main(String[] args) {
		int number1,number2,result;
		
		System.out.println("Enter two integer numbers");
		
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		
		scan.close();
		
		result = number1 + number2;
		
		System.out.println(result+ " is addition of two numbers");
		
	}

}
