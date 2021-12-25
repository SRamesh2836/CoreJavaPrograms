package com.demo.example;

public class RemoveDuplicates {
public static void removeDuplicates(int[] elemetns){
	int len = elemetns.length;
	for(int i=0;i<len-1;i++){
		int count = 0;
		for(int j=i+1;j<len;j++){
			if(elemetns[i] == elemetns[j]){
				count++;
			}
		}
		if(count==0){
			System.out.print(elemetns[i]+" ");
		}
		
	}
}
	
	
	public static void main(String[] args) {
		int[] elements = {1,3,5,4,3,-9,5,7,8,9,4,22,45,6,55};
		removeDuplicates(elements);
	}
}
