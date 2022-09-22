package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Triangle10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int k = 64;
			for (int j = 0; j < n; j++) {
				k++;
				if (i+j<n-1) {
					System.out.print((char)k);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
