package com.programs.corejava;

public class StringReverse {
	public static void main(String[] args) {
		String str= "javaconceptoftheday";
		System.out.println(recursiveMethod(str));
	}
	public static String recursiveMethod(String str){
		if(null == str || str.length() <= 1){
			return str;
		}
		System.out.println(str.substring(1)+str.charAt(0));
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
