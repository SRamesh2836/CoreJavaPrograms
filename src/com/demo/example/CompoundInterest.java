package com.demo.example;

public class CompoundInterest {
	public static void main(String[] args) {
		System.out.println(CompoundInterest.calculate(100000, 1, 1.25, 1));
		
	}
    public static double calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;
        return interest;
    }


}
   