package com.test;

import java.util.Scanner;

public class NumberGreater {

	public static void main(String[] args) {
		int number;
		
		System.out.println("Enter an Integer Number");
		Scanner scan = new Scanner(System.in);
		number= scan.nextInt();
		scan.close();
		
		if(number>100 && number<200)
		{
			System.out.println(number+ " is a greater number");
		}else
		{
			System.out.println(number+ " is a smaller number");
		}
		

	}

}
