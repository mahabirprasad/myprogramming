package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Triangle4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int k = 0;
			for (int j = 0; j < n; j++) {
				k++;
				if (i + j < n - 1) {
					System.out.print(k);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
