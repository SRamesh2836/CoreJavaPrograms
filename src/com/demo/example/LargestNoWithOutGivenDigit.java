//For example, If 145 is the given number and 4 is the given digit, then you should find the largest number less than 145 such that it should not contain 4 in it. In this case, 139 will be the answer.
package com.demo.example;

public class LargestNoWithOutGivenDigit {
public static void main(String[] args) {
	int n = 145;
	int d =4;
	char c = Integer.toString(d).charAt(0);
	for(int i =n;i>0;i--){
		String s = String.valueOf(i);
		if(!s.contains(String.valueOf(c))){
			System.out.println(i);
			break;
			
		}
		
	}
	
}
}
