package com.demo.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class RemoveDuplicatesFromListOfLinkedHashMap {
	
	public static void main(String[] args) {
		LinkedHashMap<String,Object> map1 = new LinkedHashMap<>();
		map1.put("Id",121);
		map1.put("name","text1");
		LinkedHashMap<String,Object> map2 = new LinkedHashMap<>();
		map2.put("Id",131);
		map2.put("name","text2");
		LinkedHashMap<String,Object> map3 = new LinkedHashMap<>();
		map3.put("Id",121);
		map3.put("name","text1");
		
		ArrayList<LinkedHashMap<String,Object>> list = new ArrayList<>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		System.out.println(list);
		
//		HashSet<LinkedHashMap<String,Object>> set = new HashSet<LinkedHashMap<String,Object>>();
//		set.addAll(list);
		System.out.println(new HashSet<LinkedHashMap<String,Object>>().addAll(list));
		System.out.println(list);



		
	}

}
