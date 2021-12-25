package com.corejava.strings;
//If input is “abb”  then output should be “a”, “b”,”b”, “ab”, “bb”, “abb”
public class AllSubstringsOfString {
	public static void main(String[] args) {
		String str = "ramesh";
		for(int i = 0; i< str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				System.out.print(str.substring(i, j)+" ");
			}
		}
	}

}
