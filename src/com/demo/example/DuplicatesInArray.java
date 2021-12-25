package com.demo.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInArray {
public static void duplicates(){
	int arr [] = {3,2,54,67,54,3,2,79,54,79,2,10,10,11,11};
	int len = arr.length;
	
	// ##############    First Sc ##########
//	for(int i = 0;i<len;i++){
//		for(int j = i+1;j<len;j++){
//			if(arr[i] == arr[j]){
//				System.out.print(arr[i]+" ,");
//			}
//		}
//	}
	
	// ############### Second Sc ##########
//	Set<Integer> s = new HashSet<>();
//	for(int ar : arr){
//		if(s.add(ar) == false) {
//			System.out.print(ar+" ,");
//
//		}
//	}
	Map<Integer,Integer> duplicateArr = new HashMap<>();
	for(Integer ar : arr){
		Integer count  = duplicateArr.get(ar);
		if(count == null){
			duplicateArr.put(ar, 1);
			}
		else{
			duplicateArr.put(ar, ++count);
		}
		
		}
	Set<Entry<Integer,Integer>> entrySet = duplicateArr.entrySet();
	for(Entry<Integer,Integer> set : entrySet){
		System.out.println(set.getKey()+"---"+set.getValue());
	}
	}
public static void main(String[] args) {
	DuplicatesInArray.duplicates();
	
}
}
