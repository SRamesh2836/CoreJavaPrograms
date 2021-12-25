package com.demo.example;

public class ThirdLargetInArray {
	public static void main(String[] args) {
		int array[] = {23,45,34,77,91,3,64,66,72,35,27};
		for(int i = 0;i<array.length;i++){
			for(int j = i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
			
		}
		
		System.out.println("Third Highest no is:"+array[array.length-3]);
		
		
	}

}
