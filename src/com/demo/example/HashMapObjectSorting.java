package com.demo.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapObjectSorting {
		private int id;
		private String name;
		public HashMapObjectSorting(int id,String name){
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		


	public static void main(String[] args) {
		Map<HashMapObjectSorting,String> map = new HashMap<>();
		HashMapObjectSorting s1 = new HashMapObjectSorting(25,"Ramesh");
		HashMapObjectSorting s2 = new HashMapObjectSorting(21,"Ganesh");
		map.put(s1, "Test1");
		map.put(s2, "Test2");
		List<Map.Entry<HashMapObjectSorting,String>> list = new ArrayList<Map.Entry<HashMapObjectSorting,String>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<HashMapObjectSorting,String>>(){
			@Override
			public int compare(Map.Entry<HashMapObjectSorting,String> obj1,Map.Entry<HashMapObjectSorting,String> obj2){
				return obj1.getKey().getName().compareTo(obj2.getKey().getName());
			}
		});
		for(Map.Entry<HashMapObjectSorting,String> list1 : list){
			System.out.println(list1.getValue());
		}
		

		
		
	}
}
	
