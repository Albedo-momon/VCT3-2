package com.test.arralisttest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Test {
	
	public static  List<String> doSorting(List<String> obj){
		
		obj.stream().forEach(name ->{
			System.out.println(name);
		});
		
		return obj;
	}

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ketan","Suraj","Suvarna","Ritika","Sanket");
//		System.out.println(doSorting(names));
		
		for(String nm : names) {
			System.out.println(nm);
		}
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
