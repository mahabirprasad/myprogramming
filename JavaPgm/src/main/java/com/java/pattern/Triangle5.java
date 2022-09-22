package com.java.pattern;

import java.util.Iterator;
import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Triangle5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}