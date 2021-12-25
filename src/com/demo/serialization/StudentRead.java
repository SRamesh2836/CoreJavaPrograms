package com.demo.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentRead
{
  public static void main(String args[]) throws Exception
  {
    FileInputStream fis = new FileInputStream("D:\\abc.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);

    while(true)
    {
      try
      {
        Student st = (Student) ois.readObject( );
        System.out.println(st.getRollNumber() + ", " + st.getName( ) + ", " + st.getMarks( ) + ", " + st.getAddress()+ ", " + st.getQualification());
      }
      catch(EOFException e)
      {
        break;
      }
    } 

    ois.close(); 	
    fis.close();
  }
}
