package com.programs.corejava;

public class ABC {
	public int sol(int n){
		
		int k = 0;
		int sum = k;		
		while(sum <= n){
			sum = sum+k;
			if(sum>n)
				return k-1;
			else
			k = k+1;	
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ABC ob = new ABC();
System.out.print(ob.sol(655));
	}

}
