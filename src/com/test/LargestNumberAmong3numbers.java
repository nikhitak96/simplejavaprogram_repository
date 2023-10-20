package com.test;

import java.util.Scanner;

public class LargestNumberAmong3numbers {

	public static void main(String[] args) {
		int num1,num2,num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = input.nextInt();
		
		System.out.println("Enter second number");
		num2 = input.nextInt();
		
		System.out.println("Enter third number");
		num3 = input.nextInt();
		
		input.close();
		
		if(num1>num2) {														
			if(num1>num3) {
				System.out.println(num1+ " num1 is greater");
			}else if(num2>num1) {
				if(num2>num3) {
					System.out.println(num2+ " num2 is greater");
				}
			}
		}else {
			System.out.println(num3+ " num3 is greater");
		}
			// int largest;
			// if( num1 > num2 && num1 > num3)
			// largest = num1;
			// else if( num2 > num1 && num2 > num3)
			// largest = num2;
			// else 
			// largest = num3;
		
			// System.out.printf("Largest among %d %d and %d is %d",num1,num2,num3,largest );
	}

}
