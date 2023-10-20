package com.test;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		// 2 * 1 = 2;  2->number  1->multiplier  //number * multiplier = result

		int number,multiplier;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		number = scan.nextInt();
		scan.close();
		
		for( multiplier = 1; multiplier <= 10; multiplier++ )
		{
			System.out.printf(" %d * %d = %d\n", number,multiplier,(number * multiplier));
		}
		
	}

}
