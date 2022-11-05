//java Labtest5e
//author :zaid khan
//5) Prepare program with StringBuffer and StringBuilder
//classes with methods?

//a)equals() b)reverse() c)append() d)delete() f)insert()
class Labtest5e
{
	public static void main(String [] args)
	{
		StringBuffer mystr =new StringBuffer("ramulal");
		System.out.println(mystr.equals("ramulal"));
		//System.out.println(mystr.reverse());
		System.out.println(mystr.append("rao"));
		System.out.println(mystr.delete(3,5));
		System.out.println(mystr.insert(0,"sri"));
		
		
	}
}