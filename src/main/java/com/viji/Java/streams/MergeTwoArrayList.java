package com.viji.Java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeTwoArrayList {

	@Test
	public void printingTwoArrayList() {
		List<String> list1 = Arrays.asList("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa");

		List<String> list2 = new ArrayList<>();
		list2.add("Chitra");
		list2.add("Manickam");
		list2.add("SelvaKumar");
//		System.out.println(list1.toString());
//
//		System.out.println(list2.toString());

	}

	@Test
	public void mergeTwoArrayListUsingStream() {
		List<String> list1 = Arrays.asList("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa");

		List<String> list2 = new ArrayList<>();
		list2.add("Chitra");
		list2.add("Manickam");
		list2.add("SelvaKumar");

		Stream<String> concatenatedTwoStream = Stream.concat(list1.stream(), list2.stream());
		concatenatedTwoStream.forEach(s -> System.out.println(s));

	}

	@Test
	public void findAnElementFromListUsingStream() {
		List<String> list1 = Arrays.asList("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa");

		boolean flag = list1.stream().anyMatch(s -> s.equalsIgnoreCase("Viji"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test
	public void streamCollect() {
		List<String> list1 = Arrays.asList("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa");

		List<String> collecttedResult = list1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collecttedResult.toString());
		String string = collecttedResult.get(0);
		System.out.println("First Element: " +string);

	}
}
