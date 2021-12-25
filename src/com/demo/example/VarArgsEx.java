package com.demo.example;

public class VarArgsEx {
	public static int sum(int... a){
		int sum = 0;
		for(int i : a){
			sum = sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(VarArgsEx.sum(10,20));
		System.out.println(VarArgsEx.sum(10,20,30));
		System.out.println(VarArgsEx.sum(10,20,30,40));
		System.out.println(VarArgsEx.sum(10,20,30,40,50));



	}

}
