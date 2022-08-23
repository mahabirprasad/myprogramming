package com.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.print.DocFlavor.STRING;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Occurance {

	public static void main(String[] args) {
		String str = "Corona Virus which is commonly known as COVID-19 is an infectious disease that causes illness in the respiratory system in humans. The term Covid 19 is sort of an acronym, derived from “Novel Corona Virus Disease 2019”. Corona Virus has affected our day to day life. This pandemic has affected millions of peoples, who are either sick or are being killed due to the spread of this disease.";
		String[] st = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String string : st) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}
		Set<String> keys = map.keySet();
		for (String string : keys) {
			if (map.get(string) > 1) {
				System.out.println(string + " is " + map.get(string) + " times");
			}
		}
	}

}
