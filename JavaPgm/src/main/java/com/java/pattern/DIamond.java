package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class DIamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int spaces = n / 2;
		int stars = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			for (int k =0; k < stars; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i<n/2) {
				spaces--;
				stars+=2;
			} else {
				spaces++;
				stars-=2;
			}
			
		}
	}

}
