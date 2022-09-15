//Author : Zaid khan java-C2533
//Date : 15 / 8/ 22
import java.lang.*;
class Sequence
{
	public static void main(String [] args)
	{
		int i = 1;
		System.out.println( " sequence of incrementation of 3");
		while(i<=10)
		{
			System.out.println( i=i+3);
			
			
		}
		System.out.println( "squares sequence");
		for(int j = 1 ; j<=10 ; j++)
		{
			System.out.println( j*j);
		}
		
		System.out.println( "Fibonacci Series");
		int f0 =0 , f1=1 ,fib;
		for(int k = 0 ; k<=10 ; k++)
		{
			 
			 fib=f0+f1;
			System.out.println( fib );
			f0 = f1;
			f1 = fib;
		}
		
	}
	}