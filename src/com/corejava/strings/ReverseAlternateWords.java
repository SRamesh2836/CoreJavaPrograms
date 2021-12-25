package com.corejava.strings;

import java.util.Scanner;

public class ReverseAlternateWords {    

	    public static String reverseAltWord(String value) {

	        String[] tempValue = value.split("\\s");        

	        for (int j=0; j<tempValue.length; j=j+2) {

	            String curValue = tempValue[j];
	            char[] valueList = new char[curValue.length()];

	            int k = 0;
	            for (int i = curValue.length() -1; i>=0; i--) {

	                valueList[k] = curValue.charAt(i);
	                k++;
	            }

	            tempValue[j] = String.valueOf(valueList);
	        }

	        value = "";
	        for (int i=0; i<tempValue.length;i++) {

	            value = value + tempValue[i] + " ";
	        }
	        
	        return value;                
	    }

	    public static void main(String[] args) {

	        String value ;

	        Scanner input = new Scanner (System.in);

	        System.out.println ("Enter String Value to be reversed: ");
	        value = input.nextLine();

	        String reversedString = reverseAltWord(value);

	        System.out.println("Reverse2 String is : " + reversedString);        
	    }
	}

