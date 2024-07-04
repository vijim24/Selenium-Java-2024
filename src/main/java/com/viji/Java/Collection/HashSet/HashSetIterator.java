package com.viji.Java.Collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<>();
		obj.add("Viji");
		obj.add("Vinayagar");
		obj.add("Murugar");
		obj.add("Apple");
		System.out.println(obj);
		
		Iterator<String> a=obj.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}

	}

}
