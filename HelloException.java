//1)wrp to demo &#39;NullPointerException&#39; and
//&#39;ArrayIndexoutOfBoundException&#39; with nested ...try blocks
//Author : zaid khan
class HelloException
{
	public static void main(String [] args)
	{
	try//nested
	{
		//NullPointerException:
	try
	{
		String str = null;
		if(str.equals("abc"))
			System.out.println("same");
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	
		//ArrayIndexOutOfBoundsException:
	try
	{
		int  arr[]= {1,2,3};
		System.out.println(arr[4]);	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
		System.out.println("Other code");

	
	}
	catch(Exception e)
	{
		System.out.println("handelled");
	}
	System.out.println("Other code");
	}
}





