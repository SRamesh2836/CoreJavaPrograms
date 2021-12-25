package com.programs.corejava;

public class StringExamples
{
    public static void main(String[] args)
    {
    	
    	String str1 = "abc";
    	String str2 = "abc";
    	System.out.println(str1==str2);  // true
    	System.out.println(str1.equals(str2)); //true
    	 str1 = str1+"def";
     	System.out.println(str1==str2);  // false
     	System.out.println(str1.equals(str2)); //false

    	 
    	
        String s1 = new String("JAVA");
        String s3 = "JAVA";
        System.out.println(s1==s3);  //false
        System.out.println(s1.equals(s3)); //true
 
        System.out.println(s1);         //Output : JAVA
 
        s1.concat("J2EE");
 
        System.out.println(s1);         //Output : JAVA
        
         s1 = s1.concat("J2EE");
        System.out.println(s1);     //JAVAJ2EE
    }
}
