//Author= zaid khan
//Date= 8/12/22
//prepare Junit test case with  Students collection List?
package LabTest;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitLab2 {
 static ArrayList<String> student;
 
 
 //before all annotation
@BeforeAll
public static void a1()
{
System.out.println("Executing before all annotation");	
}


// After all annotation"
@AfterAll
public static  void a2()
{
System.out.println("Executing After all annotation");	
}

//before Each annotation
@BeforeEach
public  void a3()
{
	student = new ArrayList<String>();
System.out.println("Executing before Each annotation");	
}

//@Test annotation
	@Test
	void test() {
		student.add("zaid");
		student.add("alam");
		student.add("khalid");
		student.add("adnan");
	}
	
	
	
//After Each annotation	
	@AfterEach
	public  void a4()
	{
		for(String x:student)
			System.out.println(x);	
	System.out.println("Executing After Each annotation");	
	}
	

}
