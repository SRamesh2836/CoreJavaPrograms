package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunctionalInterfaces {

	public static void main(String[] args) {
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(101, "Ramesh", 82.83, "Mathematics"));
		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
        
		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
		         
		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
		         
		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
		         
		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
		         
		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
		         
		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
		         
		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
		         
		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
		         
		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		
		/**
		 * Predicate Logic
		 *method in Predicate functional interface 
		 *boolean test(T t);
		 *Use this interface when you want 
		 *to evaluate a boolean expression which takes an argument of type T
		 */
		
		Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
        
		List<Student> mathematicsStudents = new ArrayList<Student>();
		         
		for (Student student : listOfStudents) 
		{
		    if (mathematicsPredicate.test(student)) 
		    {
		        mathematicsStudents.add(student);
		    }
		}
		System.out.println("No of Mahs Students:"+mathematicsStudents.size());
		
		
		/**
		 * Consumer Logic
		 *method in Consumer functional interface 
		 *void accept(T t);
		 *Use this interface when you want to perform
		 *some operation on an object
		 */
		Consumer<Student> percentageConsumer = (Student s) -> System.out.println(s.getName()+" : "+s.getPercentage());
		for(Student s :listOfStudents){
			percentageConsumer.accept(s);
			
		}
		
		/**
		 * Function Logic
		 *method in Function functional interface 
		 *R apply(T t);
		 *Use this interface when you want to extract
		 *a data from an existing  data
		 */
		
		Function<Student,String> nameFunction = (Student s)->s.getName();
		List<String> studentNames = new ArrayList<String>();
		for(Student s : listOfStudents){
			studentNames.add(nameFunction.apply(s));
		}
		
		
		/**
		 * Supplier Logic
		 *method in Supplier functional interface 
		 *T get();
		 *Use this interface when you want to create a new Object
		 */
		
	Supplier<Student> studentSupplier = ()->new Student(1010,"Ram",90.10,"Maths");
	listOfStudents.add(studentSupplier.get());
		
		
	}

}
