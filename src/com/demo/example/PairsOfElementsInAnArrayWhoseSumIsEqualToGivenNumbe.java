//For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all pairs of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20
package com.demo.example;

public class PairsOfElementsInAnArrayWhoseSumIsEqualToGivenNumbe {
	public static void main(String[] args) {
		int arr[] = {4, 5, 7, 11, 9, 13, 8, 12};
		int n = 20;
		System.out.print("Pairs of elements whose sum is "+n);
		for(int i= 0; i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==n){
					System.out.print(arr[i]+"+"+arr[j]+"="+n);
				}
			}
			System.out.println();
		}
	}

}
