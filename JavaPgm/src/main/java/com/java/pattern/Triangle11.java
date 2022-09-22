package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Triangle11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int k=64;
		for (int i = 1; i < n; i++) {
			k++;
			for (int j = 0; j < i; j++) {
				System.out.print((char)k);
			}
			System.out.println();
		}
	}

}
