package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class DiffeChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
		int uc = 0, lc = 0, spc = 0, sp = 0, dp = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				uc++;
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				lc++;
			} else if (ch[i] >= 48 && ch[i] <= 57) {
				dp++;
			} else if (ch[i] == ' ') {
				sp++;
			} else {
				spc++;
			}
		}
		System.out.println("Uppercase" + uc);
		System.out.println("lowercase" + lc);
		System.out.println("numbers" + dp);
		System.out.println("Space" + sp);
		System.out.println("special character" + spc);
	}

}
