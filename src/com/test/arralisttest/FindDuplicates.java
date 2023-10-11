package com.test.arralisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,2,2,2,2,2,2);
		printDuplicates(numbers);
	}

	private static void printDuplicates(List<Integer> numbers) {
		// TODO Auto-generated method stub	
		Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//((2,1), 1)
		//{1=1,2=2,3=2,4=1,6=1,5=1,}
		List<Integer> duplicates = frequencyMap.entrySet().stream().filter(entry -> entry.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println("Duplicate Element: "+ duplicates);
		
		List<Integer> duplicates2 = new ArrayList<>();
		for(Integer number: numbers) {
			if(Collections.frequency(numbers, number)>1 && !(duplicates2.contains(number))) {
				duplicates2.add(number);
			}
		}
		
		
		System.out.println("Duplicate elements: " + duplicates2);
	
	}

}
