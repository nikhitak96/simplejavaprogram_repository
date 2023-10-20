package com.test;

import java.util.Scanner;

public class SwapTwoNumbersUsingTempVariable {

	public static void main(String[] args) {
		
		int num1,num2,temp;
															//num1=10  num2=20 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number for num1"); //we use temp variable which store either num1 or num2
		num1 = scan.nextInt();							// for ex : if temp= num1 i.e., temp=10
														 // then we store num2 in num1 i.e., num1=20
		System.out.println("Enter the number for num2"); // then we store temp variable value in num2 i.e., num2=10
		num2 = scan.nextInt();	
		
		scan.close();
		
		System.out.printf("Before swapping num1 = %d and num2 = %d\n",num1,num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.printf("After swapping num1 = %d and num2 = %d\n",num1,num2);

	}

}
