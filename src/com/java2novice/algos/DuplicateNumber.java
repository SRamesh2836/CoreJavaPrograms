package com.java2novice.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//Program: Find out duplicate number between 1 to N numbers.
public class DuplicateNumber {
    public static void findDuplicateNumber(List<Integer> numbers){
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int n : numbers){
    		if(map.get(n)!=null){
    			map.put(n, map.get(n)+1);
    		}else{
    			map.put(n, 1);
    		}
    	}
    	Set<Entry<Integer,Integer>> entrySet = map.entrySet();
    	for(Entry<Integer,Integer> entry : entrySet){
    		if(entry.getValue() > 1){
    			System.out.println("Duplicate Elementes : "+entry.getKey());
    		}
    	}
    }
    public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

        Set<T> items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                 .collect(Collectors.toSet());

    }
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        numbers.add(12);
        numbers.add(17);
        findDuplicateNumber(numbers);
        Set<Integer> result = findDuplicateBySetAdd(numbers);

        result.forEach(System.out::println);
	}

}
