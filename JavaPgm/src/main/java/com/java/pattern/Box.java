package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
