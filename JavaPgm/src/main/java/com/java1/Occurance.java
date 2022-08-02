package com.java1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Occurance {
	private void find(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new HashMap<>();
		for (char c : ch) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		Set<Character> keys = m.keySet();
		for (Character character : keys) {
			if (m.get(character)>1) {
				System.out.println(character+" is "+m.get(character)+" times");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a STring");
		String str = sc.nextLine();
		Occurance oc = new Occurance();
		oc.find(str);

	}

}
