package com.carpusit.programs;

public class StringRev {
	public static String stringReverse(String str){
		
		if(str.length()<1 || str==null) 
			return str;
		else
			return stringReverse(str.substring(1))+str.charAt(0);
		
	}
	public static void main(String[] args) {
		System.out.print(stringReverse("Ramesh Sunkavalli"));
	}

}
