package com.viji.Java.Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> obj = new HashSet<>();
		obj.add("Viji");
		obj.add("Vinayagar");
		obj.add("Murugar");
		obj.add("Apple");
		System.out.println(obj);
		System.out.println(obj.remove("Apple"));
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
	}

}
