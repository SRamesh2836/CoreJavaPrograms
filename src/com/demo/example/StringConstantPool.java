package com.demo.example;

public class StringConstantPool {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 ="Hello";
		String str3 = "Hai";
		String st1 = new String("one");
		String st2 = new String("one");
		String st3 = new String("two");
		
		String str4 = str1;
		String st4 = new String(st1);
		
		System.out.println("str1 == str2----->"+str1==str2);//false
		System.out.println("str1 == str3----->"+str1==str3);//false
		System.out.println("st1 == st2----->"+st1==st2);//false
		System.out.println("st1 == st3----->"+st1==st3);//false
		System.out.println("str1 == str4----->"+str1==str4);//true
		System.out.println("st1 == st4----->"+st1==st4);//false

	}

}
