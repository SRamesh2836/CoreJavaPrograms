package com.programs.corejava;

class SuperClass {
	int i;
	public SuperClass(int i) {
		System.out.println("Super class constructor!");
	}
    void methodOfSuperClass()    
    {
        System.out.println("From method of super class");
    }

}

class SubClass extends SuperClass{
	SubClass(){
		super(10);
	}
	void subClassMethod(){
		System.out.println(super.i);
		super.methodOfSuperClass();
	}
	
}
public class SuperExample{
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.subClassMethod();
	}
}
