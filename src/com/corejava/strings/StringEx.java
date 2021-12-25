package com.corejava.strings;

public class StringEx {
public static void main(String[] args) {
	String str= "abc";
	String str1 = new String("abc");
	
	System.out.println(str.hashCode() +" ----" + str1.hashCode());
	System.out.println(str == str1);
System.out.println(str.equals(str1));
}
}
