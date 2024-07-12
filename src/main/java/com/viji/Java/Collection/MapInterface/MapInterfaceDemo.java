package com.viji.Java.Collection.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<>();
		a.put(11, "Apple");
		a.put(2, "Orange");
		a.put(3, "Mango");
		System.out.println(a);
		System.out.println(a.get(11));
		System.out.println(a.remove(3));
		System.out.println(a);

//		To iterate through the HashMap use the entry set --> Which is from the Set Interface

		Set<Entry<Integer, String>> entrySet = a.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());
		}
	}

}
