package com.corejava.java8;

public interface InterfaceWithDefaultMethod {
    void abstractMethod();           //Abstract Method
    
    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }
}
