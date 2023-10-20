package com.test;

import java.util.Scanner;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		
		// n! = n*(n-1)*(n-2)...*3*2*1
		// 4! = 4*3*2*1   0!= 1   
		
		int number;
		long factorial = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter the Number:");
		number = scan.nextInt();
		scan.close();
		
		if( number < 0)
		{
			System.out.println("Cant find the factorial of negative number");
		}else if( number <=1 ) {
			System.out.printf("%d! = %d",number,factorial);
		}else {
			for (int counter = number; counter >=2; counter--) {
				factorial = factorial * counter;    //counter=4 factorial=1 ,3 12 , 2 24, 1 
			}
			System.out.printf("%d! = %d",number,factorial);
		
		}
	}

}
