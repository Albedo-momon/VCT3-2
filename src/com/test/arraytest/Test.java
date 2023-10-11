package com.test.arraytest;

public class Test {

	public static void main(String[] args) {
		int [] array = {10,2,5,3,1,9,7,6,8,4};
		System.out.println("The Unsorted Array is: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		bubbleSort(array);
		
		System.out.println("The sorted Array is: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	private static void bubbleSort(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];  
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
