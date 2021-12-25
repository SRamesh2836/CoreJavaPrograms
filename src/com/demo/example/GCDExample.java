package com.demo.example;

public class GCDExample {
	public static int gcd(int x,int y){
		int gcd = 1;		
		for(int i = 1;i<=y;i++){
			if(x%i==0 && y%i==0){
				gcd  = i;
			}
			
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		System.out.println("GCD of given numbers:"+gcd(12,18));
	}

}
