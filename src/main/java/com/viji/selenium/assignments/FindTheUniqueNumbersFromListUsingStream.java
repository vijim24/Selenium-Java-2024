package com.viji.selenium.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class FindTheUniqueNumbersFromListUsingStream {

	@Test
	public void ArrayListDemo() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 3, 1);
		
	}

	@Test
	public void streamDemo() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 3, 1);

		numbers.stream().distinct().sorted().forEach(s -> System.out.println(s));
	}

}
