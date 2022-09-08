//Author : Zaid khan java-C2533
//Date : 8 / 8/ 22


 import java.io.*;
 import java.util.*;
 class Student
{
 
  
   public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);  
          System.out.print("Enter student name: ");    
          String sname = in.next();   
          System.out.println("Name: " + sname);           
          System.out.println("Enter your student id: ");  
          int sid = in.nextInt();  
          System.out.println("student id: " + sid);  
          System.out.println("Enter your Attendance: ");  
          double d = in.nextDouble();  
          System.out.println("attendane: " + d);      
  }
   }
   
  