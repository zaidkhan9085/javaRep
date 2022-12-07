
//labtest 29th oct 
//author zaid khan
//Student details print forward and backward using ListIterator methods?
import java.util.*;

public class ListIteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("zaid");
		a1.add("junaid");
		a1.add("zaid");//duplicates
		a1.add(0,"gouse");//indexing
		//printing
		ListIterator<String> it = a1.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//previous
		System.out.println("previous traverse");
		
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}




	}

}
