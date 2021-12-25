package com.demo.example;

public class ThreadJoinExample {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread is started! : Task is to print the numbers from 0 to 3000");
		final Thread t1 = new Thread(){
			@Override
			public void run(){
				for(int i=0;i<=1000;i++){
					System.out.println(i);
				}
					System.out.println("Numbers from 0 to 1000 are printed!");
			}
		};
		final Thread t2 = new Thread(){
			@Override
			public void run(){
				try{
					t1.join(5000,500000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				for(int i=1001;i<=2000;i++){
					System.out.println(i);
				}
				System.out.println("Numbers from 1001 to 2000 are printed!");
			}
		};
		final Thread t3 = new Thread(){
			@Override
			public void run(){
				try{
					t2.join(5000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				for(int i=2001;i<=3000;i++){
					System.out.println(i);
				}
				System.out.println("Numbers from 2001 to 3000 are printed!");
			}
		};
		t3.start();
		t2.start();
		t1.start();
		t3.join();
		System.out.println("Task is finished!");
	}

}
