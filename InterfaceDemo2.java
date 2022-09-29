import java.util.*;
interface Red
{
	void show();
}
interface Green
{
	void msg();
}
class Yellow
{
	void show()
	{
		System.out.println("This is red");
	}
	void msg()
	{
		System.out.println("This is green");
	}
}
class InterfaceDemo2
{
	public static void main(String [] args)
	{
		Yellow y = new Yellow();
		y.show();
		y.msg();
	}
}