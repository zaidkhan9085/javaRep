//Author : Zaid khan java-C2533
//Date : 8 / 8/ 22


 import java.io.*;
 
 class Variables
{
//instance variable
 int instVar = 10;

//static variable
 static String name = "Zaid Khan"; 
  
   public static void main(String[] args)
 {
 Variables obj = new Variables();

//local variable
 int a = 20;
 System.out.println("Instance variable is "+ obj.instvar);
 System.out.println("local variable is "+ a);
 System.out.println("Static variable is "+ Variables.name);
  }
   }

 