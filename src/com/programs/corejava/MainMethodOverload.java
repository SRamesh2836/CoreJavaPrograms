package com.programs.corejava;

public class MainMethodOverload {
	    public static void main(String[] args)
	    {
	        System.out.println("Execution starts from this method"); 
	        MainMethodOverload obj= new MainMethodOverload();
	        obj.main(1);
	        obj.main(1,20);
	    }
	 
	    void main(int args)
	    {
	        System.out.println("Another main method1");
	    }
	 
	    double main(int i, double d)
	    {
	        System.out.println("Another main method2");
	 
	        return d;
	    }
	}
