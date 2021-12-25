package com.demo.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentWrite
{
  public static void main(String args[]) throws Exception
  {
    FileOutputStream fos = new FileOutputStream("D:\\abc.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    Student std1 = new Student(35, "SNRao", 60.5, "Ameerpet, Hyderabad");
    Student std2 = new Student(45, "Jyostna", 70.5, "Paradise circle, Secunderabad");
    Student std3 = new Student(55, "Srinivas", 80.5, "Punjagutta, Hyderabad");

    oos.writeObject(std1);
    oos.writeObject(std2);
    oos.writeObject(std3);
		                         // writing anonymous Student object 
    oos.writeObject(new Student(65, "Jyothi", 90.5, "Kookatpally, Hyderabad"));

    fos.close();
    oos.close();
  }
}
