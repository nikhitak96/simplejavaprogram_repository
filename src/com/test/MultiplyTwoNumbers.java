package com.test;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		
		int num1,num2,res;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 = input.nextInt();
		
		System.out.println("Enter the second number");
		num2 = input.nextInt();
		
		input.close();
		
		res = num1 * num2;
		
		System.out.printf("%d * %d = %d",num1,num2,res); // printf = printing format
		

	}

}
