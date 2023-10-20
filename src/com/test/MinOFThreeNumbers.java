package com.test;

import java.util.Scanner;

public class MinOFThreeNumbers {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		n1 = scan.nextInt();
		
		System.out.println("Enter the second number");
		n2 = scan.nextInt();
		
		System.out.println("Enter the third number");
		n3 = scan.nextInt();
		
		scan.close();
		
		if(n1<n2) {
			if(n1<n3) {
				System.out.println("n1 is the smaller "+n1);
			}
		}else if(n2<n1) {
			if(n2<n3) {
				System.out.println("n2 is the smaller "+n2);
			}
		}else {
			System.out.println("n3 is the smaller "+n3);
		}

	}

}
