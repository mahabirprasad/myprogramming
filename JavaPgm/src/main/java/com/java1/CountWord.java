package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class CountWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
		String nst = "";
		int nc = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				nst = nst + nc + " ";
				nc = 0;
			} else {
				nc++;
				nst = nst + str.charAt(i);
			}
		}
		nst = nst + nc;
		System.out.println(nst);

	}
}
