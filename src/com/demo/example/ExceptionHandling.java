package com.demo.example;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        try
        {
            Integer I = new Integer("abc");  //This statement throws NumberFormatException
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}