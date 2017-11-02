package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		set.add("g");
		set.add("h");
		set.add("a");
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String value = (String)iter.next();
			System.out.println(value);
		}
	}
}

//class PersonComparator
