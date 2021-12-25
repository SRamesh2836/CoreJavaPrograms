package com.corejava.strings;

public class StringReverseRecursive {
	
	public static void main(String[] args) {
		System.out.print(recursive("Ramesh Sunkavalli"));
	}
	
public static String recursive(String str){
	
	if(str == null || str.length()<1)
		return str;
	else
		return recursive(str.substring(1))+str.charAt(0);
	
}
}
