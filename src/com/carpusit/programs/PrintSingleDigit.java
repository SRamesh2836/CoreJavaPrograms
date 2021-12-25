package com.carpusit.programs;

// 1235 = 1+2+3+5 = 11
//11 = 1+1 = 2
// output  = 2

public class PrintSingleDigit {
	public static void printTotalAsSinleDigit(int n){
		while(n/10!=0){
	    int sum = 0;
		while(n!=0){
			int r = n%10;
			int d = n/10;
		     sum = sum+r;
		     n = d;
			
		}
		n = sum;
		}
		System.out.println("Sum is : "+n);
	}
	
	public static void main(String[] args) {
		printTotalAsSinleDigit(1235);
	}

}
