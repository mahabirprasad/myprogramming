package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Triangle9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int k =64;
			for (int j = 0; j < i; j++) {
				k++;
				System.out.print((char)(k));
			}
			System.out.println();
		}
	}

}
