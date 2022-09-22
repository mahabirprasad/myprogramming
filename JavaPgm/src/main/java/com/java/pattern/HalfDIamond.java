package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class HalfDIamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int stars=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
