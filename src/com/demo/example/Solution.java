package com.demo.example;

import java.util.Scanner;

public class Solution {
    public int solution(int a) {
        // write your code in Java SE 8
    	String s = String.valueOf(a);
    	System.out.println(s);
    	char ch[] = s.toCharArray();
    	StringBuffer sb = new StringBuffer(a);
    	int forwardCount,backwordCount;
    	if(ch.length%2==0){
    		forwardCount = ch.length/2;
    		backwordCount = ch.length/2;
    	}
    	else{
    		forwardCount = (ch.length/2) + 1;
    		backwordCount = ch.length/2;
    	}
    	int j = ch.length-1;
    	for(int i = 0;i<forwardCount;i++){
    		sb.append(ch[i]);
    		sb.append(ch[j]);
    		j--;
    		
    	}
    	String st = String.valueOf(sb);

        return Integer.parseInt(st);
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        Solution s = new Solution();
        System.out.println(s.solution(n));
    }
}