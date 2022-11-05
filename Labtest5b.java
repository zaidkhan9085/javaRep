//Labtest5b java
//Author : zaid khan
//2)wrp to demo user defined exception?
class wrongNameException extends Exception
{
public wrongNameException(String s)
{
	super(s);
}
}
public class Labtest5b
{
	void inputCheck(String name)throws wrongNameException
	{
		if(name == "zaidkhan")
			System.out.println("valid name");
		else
			throw new wrongNameException("invalid name");
	}
	public static void main(String [] args) throws wrongNameException
	{
		Labtest5b obj = new Labtest5b();
	
	obj.inputCheck("junaidkhan");	
	
		
	}

}
