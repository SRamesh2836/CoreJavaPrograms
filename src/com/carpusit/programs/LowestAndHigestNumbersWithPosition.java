package com.carpusit.programs;

import java.awt.image.SampleModel;
import java.util.HashMap;
import java.util.Map;


public class LowestAndHigestNumbersWithPosition {
	public static void printPositionsOfHigestAndLowest(int arr[]){
		int largeNo,smallNo;
		Map<String,Integer> map = new HashMap<>();
		if(arr[0]>arr[1]){
			smallNo=arr[1];
			largeNo=arr[0];
			map.put("LargeNo", 0);
			map.put("SmallNo", 1);
		}
		else{
			smallNo=arr[0];
			largeNo=arr[1];
			map.put("LargeNo", 1);
			map.put("SmallNo", 0);
		}
		for(int i = 2;i<arr.length;i++){
			if(arr[i]>largeNo){
				largeNo=arr[i];
			map.put("LargeNo", i);
			}
			if(arr[i]<smallNo){
				smallNo = arr[i];
			map.put("SmallNo", i);
			}
		}
		System.out.println("Highest No :"+largeNo+" And Position at:"+map.get("LargeNo"));
		System.out.println("Lowest No :"+smallNo+" And Position at:"+map.get("SmallNo"));
		
	}
	public static void main(String[] args) {
		int arr[] = {22,1,54,71,2,65,88,55,93,104,51};
		printPositionsOfHigestAndLowest(arr);
	}

}
