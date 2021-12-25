package com.demo.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class InterestCalculator {
	public static void main(String[] args) {
		String inputString1 = "15/12/2014";
		String inputString2 = "11/08/2017";
		double pAmount = 180000;
		double totalInterest = 0;
		long totalDays = InterestCalculator.getDays(inputString1,inputString2);
		while(totalDays>0){
			double interest =  InterestCalculator.totalInterest(pAmount,365);
			totalDays = totalDays - 365;
			totalInterest = totalInterest + interest;
			
		}
		System.out.println("Total Interest : "+ totalInterest);
		
	}
	
	public static long getDays(String date1 , String date2){
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		long days =0;
		try {
		    Date dt1 = myFormat.parse(date1);
		    Date dt2 = myFormat.parse(date2);
		    long diff = dt2.getTime() - dt1.getTime();
		   days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		    
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return days;

	}
	public static double totalInterest(double pAmount,long totalDays){
		double totalInterest = 0;
		double iRate =  totalDays>365 ? 1.25 : 1.00;
			double interestPerDay = (pAmount*iRate/100)/30;
			totalInterest = interestPerDay*totalDays;	
		return totalInterest;
		
	}

}
