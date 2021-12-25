package com.demo.example;

import java.io.Serializable;

public class Student implements Serializable
{
  int rollNumber; 
  String name;
  double marks;
  transient String address;                // observe, transient keyword
                                           // constructor to assign properties
  public Student(int rollNumber, String name, double marks, String address)
  {
    this.rollNumber = rollNumber;
    this.name = name;
    this.marks = marks;
    this.address = address;
  }                                        // getter methods to retrieve properties
  public int getRollNumber( )
  {
    return rollNumber;
  }
  public String getName( )
  {
    return name;
  }
  public double getMarks( )
  {
    return marks;
  }
  public String getAddress( )
  {
    return address;
  }
}
