package com.test;

import java.util.Scanner;

public class LargestNumberUsingTerneryOperator {

	public static void main(String[] args) {
		
		// ternery operator 
		// conditional expression ? true value expression : false value expression;
		
		int n1,n2,n3;
		int largest;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First number");
		n1 = scan.nextInt();

		System.out.println("Enter Second number");
		n2 = scan.nextInt();
		
		System.out.println("Enter Third number");
		n3 = scan.nextInt();
		
		scan.close();
		
	largest = (n1 > n2 && n1 > n3) ? n1 : ((n2 > n1 && n2 > n3) ? n2 : n3 );
		
	System.out.printf("Largest among %d %d and %d is %d", n1,n2,n3,largest);
	}

}
