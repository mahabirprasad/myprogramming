package com.java;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class AlphaNumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an alphanumeric");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>=48 && ch[i]<=57) {
				System.out.println(ch[i]-48);
			}
		}
	}

}
