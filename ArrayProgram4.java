/*
4)To find duplicate elements and copy to another array. 
Author :zaid khan
date: 222223/09/22
*/
import java.util.*;
class ArrayProgram4
{
	public static void main(String [] args)
	{
	
	
	 String arr[]={"java","c++","java","python","c","python",".net","js","html","python"};
	 String [] arr2 = new String[10] ;
	for(int i =0; i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].equals(arr[j]))
			{
				
				arr2[i]=arr[i];
				System.out.println(arr2[i]);
			}
		}
	}
	
	
	
	}
}
	
	
