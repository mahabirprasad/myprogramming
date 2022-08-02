package com.java;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a STring");
		String str = sc.nextLine();
		String nstr = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			char t = ch[i];
			ch[i]= ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		nstr = new String(ch);
		System.out.println(nstr);
	}

}
