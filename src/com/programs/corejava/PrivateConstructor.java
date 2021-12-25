package com.programs.corejava;

public class PrivateConstructor {
	private PrivateConstructor(){
		System.out.println("Private Constructor!");
		
	}
	   void methodOne()
	     {
	          //You can use private constructor inside the class
		   PrivateConstructor obj = new PrivateConstructor();
	     }

}

class MainClass{
	public static void main(String[] args) {
        //You can't use private constructor ouside the class like this
		//PrivateConstructor obj = new PrivateConstructor();
	}
}
