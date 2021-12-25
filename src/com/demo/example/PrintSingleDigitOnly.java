package com.demo.example;

import java.util.Scanner;

public class PrintSingleDigitOnly {
	public static void main(String[] args) {
		//7453 = 7+4+5+3= 19
		// 19 = 1+9 = 10
		// 10 = 1+0 = 1
		// out put 1

		//System.out.println("Enter a number:");
		//Scanner sc = new Scanner(System.in);
		int n = 7453;
		int sum = 0;
		while(n/10 != 0){
			 sum = 0;
			while(n > 0){
				int r = n%10;
				sum = sum+r;
				int d = n/10;
				n = d;
			}
			n = sum;
		}
		System.out.println("Single digit : "+n);
	}

}
