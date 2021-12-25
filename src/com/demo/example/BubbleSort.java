package com.demo.example;

public class BubbleSort {
	public void bubbleSort(){
		int arr[] = {4,2,5,6,9,1};
		int len = arr.length;
		int k =0;
		for(int m =0;m<len;m++){
			for(int j = 0;j<len-1;j++){
				k = j+1;
				if(arr[j]>arr[k]){
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		
		for (int x = 0; x < arr.length; x++) {
			 
			System.out.print(arr[x] + ", ");
			 
			 }
			 
			System.out.println();
			}  
	}

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		b.bubbleSort();
}
}