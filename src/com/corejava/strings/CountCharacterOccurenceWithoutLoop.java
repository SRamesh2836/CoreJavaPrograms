package com.corejava.strings;

public class CountCharacterOccurenceWithoutLoop {
public static void main(String[] args) {
	String s = "Java is java again java again";
	char c = 'a';
	int count = s.length() - s.replace("a", "").length();
	System.out.println("No of Occurences"+"="+count);
}
}
