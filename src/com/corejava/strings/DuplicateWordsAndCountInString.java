package com.corejava.strings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsAndCountInString {
	
	static void duplicateWords(String input){
		String words[] = input.split(" ");
		HashMap<String,Integer> wordCount = new HashMap<>();
		for(String word : words){
			if(wordCount.containsKey(word.toLowerCase()))
				wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
			else
				wordCount.put(word.toLowerCase(),1);		
			
		}
		
		Set<String> set = wordCount.keySet();
		for(String entry : set){
			if(wordCount.get(entry)>1){
				System.out.println(entry+" : "+wordCount.get(entry));
			}
		}
		
		
		
	}
	
	  public static void main(String[] args)
	    {
	        duplicateWords("Bread butter and bread");
	 
	        duplicateWords("Java is java again java");
	 
	        duplicateWords("Super Man Bat Man Spider Man");
	    }

}
