package com.viji.Java.streams;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StoreElementsInList_FindElementsStartingWithA {
	@Test
	public void elementsStartingWithA() {

		int count = 0;
		// Creating a immutable array
		List<String> elements = List.of("Viji", "Vinayagar", "Anjenayar", "Murugar", "Ayyapan");
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).startsWith("a") || elements.get(i).startsWith("A")) {
				System.out.println(elements.get(i));
				count++;
			}

		}
		System.out.println("Count of elements which starts with  A :" + count);

		System.out.println("------------------------------------------------------------------------");

	}

	@Test
	public void elementsStartingWithAStreams() {
		List<String> elements = List.of("Viji", "Vinayagar", "Anjenayar", "Murugar", "Ayyapan");

//		elements.stream().filter((s)->{
//			return s.startsWith("A");
//		});

		long count = elements.stream().filter(s -> s.startsWith("A")).count();
		System.out.println("Count of elements starting with A using Streams " + count);
	}

	@Test

	public void elementsStartingUsingStreamsAPI() {
		long count = Stream.of("Viji", "Vinayagar", "Anjenayar", "Muruga", "Ayappan").filter(s -> {
			s.startsWith("A");
			return false;
		}).count();
		System.out.println(count);
	}

}
