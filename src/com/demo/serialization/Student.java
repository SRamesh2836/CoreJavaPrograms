package com.demo.serialization;

import java.io.Serializable;

public class Student implements Serializable
{
  int rollNumber; 
  String name;
  double marks;
  transient String address;                // observe, transient keyword
                                           // constructor to assign properties
  String qualification;
  public Student(int rollNumber, String name, double marks, String address)
  {
    this.rollNumber = rollNumber;
    this.name = name;
    this.marks = marks;
    this.address = address;
    this.qualification = qualification;
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
  public String getQualification( )
  {
    return qualification;
  }
}
