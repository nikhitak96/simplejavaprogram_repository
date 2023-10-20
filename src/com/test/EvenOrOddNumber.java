package com.test;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		//declaring variable
		int number, remainder;
		
		//print message
		System.out.println("Please Enter Integer number");
		
		//creating object
		Scanner scan = new Scanner(System.in); //passing input stream
		
		//taking input from user and storing it to number
		number = scan.nextInt();
		
		//close scanner
		scan.close();
		
		//logic
		remainder = number % 2;
		
		if(remainder == 0)
			System.out.println(number+" is an even number");
		else
			System.out.println(number+" is an odd number");
		
		//by using ternary operator
	//	System.out.println(number+ " is "+((number % 2)== 0 ? "Even" : "Odd")+" Number");
		
	}

}
