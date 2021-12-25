package com.demo.example;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int array[] = {3,63,75,27,44,92,59,2,58};
		int biggestNo = 0,secondBiggestNo =0;
//		if(array[0]>array[1]){
//		biggestNo = array[0];
//		secondBiggestNo = array[1];
//		}else{
//			biggestNo = array[1];
//			secondBiggestNo = array[0];	
//		}
		for(int i = 0;i<array.length;i++){
			if(array[i]>biggestNo){
				secondBiggestNo = biggestNo;
				biggestNo = array[i];				
			}
		}
		System.out.println("Second Biggest No:"+secondBiggestNo);
	}
}
