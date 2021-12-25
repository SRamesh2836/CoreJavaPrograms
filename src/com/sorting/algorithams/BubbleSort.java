package com.sorting.algorithams;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = {4,2,5,6,9,1};
		int j;
		for(int m = array.length ; m>=0 ; m--){
			for(int i=0;i<array.length - 1 ; i++){
				j = i+1;
				if(array[i] > array[j]){
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			for(int x=0;x<array.length;x++){
				System.out.print(array[x]+" ,");
			}
			System.out.println();
		}
	}

}


