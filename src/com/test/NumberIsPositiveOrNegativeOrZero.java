package com.test;

import java.util.Scanner;

public class NumberIsPositiveOrNegativeOrZero {

	public static void main(String[] args) {
		int number;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		number = scan.nextInt();
		scan.close();
		
		if(number>0) {
			System.out.println(number+ " is a pistive number");
		}else if(number<0) {
			System.out.println(number+ " is a negative number");	
		}else if(number == 0){
			System.out.println(number+ " is a zero");
		}
		

	}

}
