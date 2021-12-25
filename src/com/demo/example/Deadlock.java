package com.demo.example;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Deadlock {
	
	synchronized void methodOne(Deadlock d){
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName() +" is executing methodOne...");
		System.out.println(t.getName() +" is calling methodTwo ...");
		d.methodTwo(this);
		
		System.out.println(t.getName() +" is finished executing methodOne....");
		
	}
	synchronized void methodTwo(Deadlock d){
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName() +" is executing methodTwo...");
		System.out.println(t.getName() +" is calling methodOne ...");
		d.methodOne(this);
		
		System.out.println(t.getName() +" is finished executing methodTwo....");
		
	}
	public static void main(String[] args) {
		final Deadlock d1 = new Deadlock();
		final Deadlock d2 = new Deadlock();
		Thread t1 = new Thread(){
			@Override
			public void run(){
			d1.methodOne(d2);
			}
		};
		Thread t2 = new Thread(){
			@Override
			public void run(){
			d2.methodTwo(d1);
			}
		};
		t1.start();
		t2.start();
	}
	
}
