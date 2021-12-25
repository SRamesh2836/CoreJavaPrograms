package com.corejava.java8;
interface Interface
{
    default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }
}
 
interface InterfaceNew 
{
    default void anyMethod() 
    {
        System.out.println("Hi... From Interface Two");
    }
}

public class InterfaceDefaultMethodRule3 implements Interface, InterfaceNew{
	    @Override
	    public void anyMethod()
	    {
	        Interface.super.anyMethod();
	    }
	     
	    public static void main(String[] args) 
	    {
	        new InterfaceDefaultMethodRule3().anyMethod();
	    }
}

//output
//Hi... From Interface One
