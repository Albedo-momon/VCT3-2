package com.test.maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterationTestMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("Kartik", 30);
		hm2.put("Soham", 29);
		hm2.put("Test", 45);
		
		HashMap<String, Integer> hm = getMap(hm2);
		
//		Set<Entry<String,Integer>> entry =  hm.entrySet();
		
//		for(Entry<String,Integer> ent : entry) {
//			String key = ent.getKey();
//			Integer value = ent.getValue();
//			System.out.println("key: " + key + ", value: "+ value);
//		}
		
		Set<String> keys = hm.keySet();
		
//		for(String ke : keys) {
//			System.out.println(hm.get(ke));
//		}
		
		
//		Collection<Integer> vl = hm.values();
//		
//		for(Integer value : vl) {
//			System.out.println("Value: "+ value);
//		}
		
		
		Set<Entry<String,Integer>> entry =hm.entrySet();
		
		Iterator<Entry<String,Integer>> itr = entry.iterator();
		
		while(itr.hasNext()) {
			Entry<String,Integer> en = itr.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}
		
		hm.forEach((key, value)->{
			System.out.println("key: " + key + ", value: "+ value);
		});
		

	}

	private static HashMap<String, Integer> getMap(HashMap<String, Integer> hm) {
	
		return hm;
		
	}
	


}
