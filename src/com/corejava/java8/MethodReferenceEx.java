package com.corejava.java8;

import java.util.function.Function;

public class MethodReferenceEx {
	public static void main(String args[]) {
		//method reference to static method
		Function<String,Integer> lambdaFunction = (String s) -> Integer.parseInt(s);
		System.out.println(lambdaFunction.apply("12"));
		Function<String,Integer> methodReferenceFunction = Integer::parseInt;
		System.out.println(methodReferenceFunction.apply("12"));
		//Method reference to instance method (ClassName::MethodName)
        Function<String, String> lambdaFunction1 = (String s) -> s.toLowerCase();
        System.out.println(lambdaFunction1.apply("JAVA"));
        Function<String, String> referenceFunction = String::toLowerCase;
        System.out.println(referenceFunction.apply("JAVA"));
		
	}

}
