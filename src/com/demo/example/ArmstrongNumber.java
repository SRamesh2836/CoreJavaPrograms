package com.demo.example;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp>0){
			int d = temp/10;
			int r = temp%10;
			sum = sum+(r*r*r);
			temp = d;
		}
		if(n == sum)
			System.out.println("Given Number is Armstrong Numnber!");
		else
			System.out.println("Given Number is not a 153Armstrong Numnber!");
		
	}

}
