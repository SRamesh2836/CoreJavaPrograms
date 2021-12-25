package com.demo.example;

public class AlternatePrimeNumbers {
	public static void printAlternatePrimes(int n){
		int alternativePrime = 1;
		for(int i=2;i<=n;i++){
			int count = 0;
			for(int j = 1;j<=i;j++){
				if(i%j == 0)
					count = count+1;
			}
			if(count == 2 && ++alternativePrime%2 == 0)
				System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		System.out.print("Alternative Primes upto 100 are:");
		printAlternatePrimes(100);
	}

}
