package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class MPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("enter spaces");
		int spaces = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < spaces; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
			spaces -= 2;
		}

	}

}
