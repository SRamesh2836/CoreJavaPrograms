package com.demo.example;

public class LargestAndSmallestElementInArray {
	public static void main(String[] args) {
		int arr[] = {22,54,71,2,65,88,55,93,51};
		int smallest,largest;
		if(arr[0] > arr[1]){
			smallest = arr[1];
			largest = arr[0];
		}
		else{
			smallest = arr[0];
			largest = arr[1];

		}
		for(int i = 2;i<arr.length;i++){
			if(arr[i]>largest){
				largest = arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		System.out.println("larget is :"+largest+ " Smallest is :"+smallest);
	}

}
