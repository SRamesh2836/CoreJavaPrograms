package com.demo.example;

import java.util.Scanner;

class ArrayOfObjects{
private int sno;
private String sname;
ArrayOfObjects(int sno,String sname){
this.sno = sno;
this.sname = sname;
}
public String toString(){
String str = sno+"\t"+sname;
return str;
}
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of students:");
	int n = sc.nextInt();
	ArrayOfObjects obj[] = new ArrayOfObjects[n];
	for(int i=0;i<n;i++){
	
	System.out.print("Enter student number:");
	int sno = sc.nextInt();
	System.out.print("Enter student name:");
	String sname = sc.next();
	obj[i] = new ArrayOfObjects(sno,sname);
}
for(int j=0;j<obj.length;j++){
	System.out.println(obj[j]);
}
}
	
}