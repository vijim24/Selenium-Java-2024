package com.viji.Java.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
//		Adding Elements
		a.add("Vinayagar");
		a.add("Murugar");
		a.add("Apple");
		a.add("Orange");
		System.out.println(a);
//		Adding Elements based on index position
		a.add(1, "Anjeneyar");
		System.out.println(a);
//		Removing Elements based on Index
		a.remove(3);
//		Removing Elements based on Object
		a.remove("Orange");
		System.out.println(a);
//		Get the value from certain position
		System.out.println(a.get(2));

//		Check whether certain text is present in the container
		System.out.println(a.contains("Vinayagar"));
//		check what value is present in that Index position
		System.out.println(a.indexOf("Vinayagar"));
//		Check whether the array is empty or not
		System.out.println(a.isEmpty());
//		Check the size of the Array
		System.out.println(a.size());
	}

}
