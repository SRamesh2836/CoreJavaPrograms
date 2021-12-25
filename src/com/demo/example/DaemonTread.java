package com.demo.example;

public class DaemonTread extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=1000;i++){
			System.out.println("This is an User Thread!");
		}
		
	}
	public static void main(String[] args) {
		DaemonTread th = new DaemonTread();
		th.setDaemon(true);
		th.start();
	System.out.println(th.isDaemon());
	}

}
