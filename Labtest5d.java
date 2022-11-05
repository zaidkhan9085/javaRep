//java Labtest5d
//author :zaid khan
//)Prepare program using String manipulation methods
//a)== b)equals() c)concat() d)replace() e)split()
//f)charAt g)compareTo() h)substring()

class Labtest5d
{
	public static void main(String [] args)
	{
		String str1 = "zaid";
		String str2 = "junaid";
		String str3 = "khan";
		String str4 = "nuri";
		
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(str1.concat(" "+str3));
		System.out.println(str1.replace("zaid","alam"));
		String [] s = str1.split(" ");
		for(String i:s)
		System.out.println(i);
		System.out.println(str1.charAt(3));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(1,3));




	}
	
}