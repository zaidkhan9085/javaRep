/*
3)Find maximum of array element,Minimum of array element using Methods?

*/
import java.util.*;
class ArrayProgram2
{
	//declaring the array
	static int arr[] = {10, 24, 45, 90, 100};
	
	// Method to find maximum in arr[]
	static int largest()
	{
		int i;
		
		// Initialize maximum element
		int max = arr[0];
		
		
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		
		return max;
	}

	
	//method for smallest
	
	
	static int smallest()
	{
		int i;
		
		// Initialize maximum element
		int min = arr[0];
		
		// Traverse array elements from second and
		// compare every element with current max
		for (i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		
		return min;
	}
	public static void main(String [] args)
	{
		
		
		
	 
		System.out.println("the largest number in the array:"+largest());
		System.out.println("the smallest number in the array:"+smallest());

		
	}
}