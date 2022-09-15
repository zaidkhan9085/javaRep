//Author : Zaid khan java-C2533
//Date : 15 / 8/ 22
// Program to check the largest amongst the 3 numbers

import java.lang.*;
class Largest
{
	public static void main(String [] args)
	{
		//Decalaring the variables 
		int a , b, c;
		a =10;
		b=20;
		c=9;
		//checking the which one is the largest
		if(a>b && a>c)
			System.out.println("a is the largest ");
		else if(b>a && b>c)
			System.out.println("b is the largest ");
		else
			System.out.println("c is the largest ");
			
	}
}

