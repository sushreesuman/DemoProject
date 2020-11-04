package com.qa.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	public static void main(String[] args) {
		Map<String,Integer> marks = new HashMap<String, Integer>();
		marks.put("Sus",100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);	
		marks.put(null,500);
		marks.put("Putul", 900);
		
		//hashing; hashCode()->hashing //hashmap collision - behaves like LinkedList 
		//hashcode and equals method compliments each other// on the basis of hashcode, index will bt calculated
		
		
		
	}
}
