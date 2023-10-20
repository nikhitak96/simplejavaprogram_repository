package com.test;

import java.util.Scanner;

public class ToFindAllDivisorOfNaturalNumber {

	public static void main(String[] args) {
		
		//  2/number  rem=0 ,  3/number rem=0 till number/2

		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the natural number");
		number = scan.nextInt();
		scan.close();
		
		System.out.printf(" The Divisors of the number %d are \n",number);
		//System.out.printf("%d %d",1,number);
		
		for( int divisor = 1; divisor <= number; divisor++ )
				{
			if ((number % divisor) == 0)
				System.out.printf("%d ",divisor);
			
				}
		
	}

}
