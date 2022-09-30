//this' keyword Constructor chaining
//Author = zaid khan
//date = 29/09/22
class Constructor
{
	Constructor()
	{
		this(5);
		System.out.println("Default constructor");
		
	}
	
	//parameterized constructor 2
	Constructor(int x)
	{
		this(10,10);
		System.out.println("parameterized constructor 2:" + x);
		
	}
	//parameterized constructor 3
	Constructor(int x ,int y)
	{
		System.out.println(x+y + ": is parameterized constructor 3"  );;
	}
}
class ConstructorChaining
{
	public static void main(String [] args)
	{
		Constructor c = new Constructor();
	}
}