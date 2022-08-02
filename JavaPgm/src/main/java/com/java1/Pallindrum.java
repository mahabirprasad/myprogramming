package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Pallindrum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = t;
		}
		String nstr = new String(ch);
		if (str.equalsIgnoreCase(nstr)) {
			System.out.println("pallindrum");
		}else {
			System.out.println("not pallindrum");
		}
			
	}

}
