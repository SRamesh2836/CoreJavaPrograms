package com.corejava.java8;

	interface Interface1
	{
	    default void anyMethod()
	    {
	        System.out.println("Hi... From Interface One");
	    }
	}
	 
	interface Interface2 extends Interface1
	{
	    @Override
	    default void anyMethod() 
	    {
	        System.out.println("Hi... From Interface Two");
	    }
	}
	 
	public class InterfaceDefaultMethodRule2 implements Interface1, Interface2
	{
	    public static void main(String[] args) 
	    {
	        new InterfaceDefaultMethodRule2().anyMethod();
	    }
}
	
	//output
	//Hi... From Interface Two
