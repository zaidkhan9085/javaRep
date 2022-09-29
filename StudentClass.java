//1)create Student class with sid,sname,marks datamembers and input() method for input details and output() method to print details?
//Author = zaid khan
//date = 29/09/22
import java.util.*;
class Data
{
int sid, marks;
String sname;

	Scanner sc = new Scanner(System.in);
	void inputDetails()
	{
		System.out.println("enter student id");
		sid = sc.nextInt();
		System.out.println("enter student name");
		sname =sc.next();
		System.out.println("enter student marks");
		marks = sc.nextInt();
	}
	void outputDetails()
	{
		System.out.println(sid + " name : "+sname + "  marks :" + marks);
		
	}
}
class StudentClass
{
	public static void main(String [] args)
	{
		Data d = new Data();
		d.inputDetails();
		d.outputDetails();
	}
}