package com.demo.example;

import java.util.Scanner;

public class PrimeNo {
	public static void checkPrime(int n){
		int count = 0;
		for(int i=2;i<=n;i++){
			  if(n%i==0)
			     count = count+1;
		}
		   if(count>1)
			      System.out.println("Not a prime no!");
			   else
				  System.out.println("Prime No!");

		
	}
	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		checkPrime(n);
		
		
	}

}
