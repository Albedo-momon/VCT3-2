package com.test.arraytest;

import java.util.ArrayList;

public class FindPairs {
//find all pair of elements in integer array 
//	 whose sum is equal to given number
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int target = 10;

		findPairsInArray(array, target);

	}

	private static void findPairsInArray(int[] array, int target) {

		ArrayList<int[]> pairs = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					pairs.add(new int[] { array[i], array[j] });
				}
			}
		}
		
		

		System.out.println("The pairs whose sum is equal to " + target + " are:");
		for (int[] pair : pairs) {
			System.out.println(pair[0] + ", " + pair[1]);
		}

	}

}
