//)To prepare Exception using &#39;throw&#39; and &#39;throws&#39;
//java Labtest5c
//author :zaid khan
class invalidPasswordException extends Exception
{
  public invalidPasswordException(String s)
	{
		super(s);
	}
}
public class Labtest5c
{
	public void checkPass(String pass) throws invalidPasswordException
	{
		if(pass.equals("123456"))
			System.out.println("valid");
		else
			throw new invalidPasswordException("invalid password");
	}
	public static void main(String [] args) throws invalidPasswordException
	{
		
		Labtest5c obj = new Labtest5c();
		obj.checkPass("sfjkjsjld");
	}
}
