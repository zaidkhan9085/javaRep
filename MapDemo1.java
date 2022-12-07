
//labtest 29th oct 
//author zaid khan
//HashMap" and "LinkedHashMap",”TreeMap” collections with insertion,updation,deletion?

import java.util.*;
class MapDemo1
{
	public static void main(String [] args)
	{
		Map <Integer,String> map = new HashMap <Integer,String>();
		map.put(1,"zaid");
		map.put(2,"junaid");
		map.put(3,"rabnawaz");
		map.put(4,"ali");
		map.put(5,"aman");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		//insertion
		map.putIfAbsent(6,"khalid");
		System.out.println("after updation");
		
				
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		//keybased removal
		map.remove(1);
		System.out.println("after updation" +map);	
		
				System.out.println("New Hasmap");	

		//hashmap replace
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul"); 
	  for(Map.Entry m:hm.entrySet())
	  {
		  System.out.println(m.getKey() + " " +m.getValue());
	  }
	  hm.replace(101,"yaqoob");
	  System.out.println("updated Hasmap");
	  for(Map.Entry m:hm.entrySet())
	  {
		  System.out.println(m.getKey() + " " +m.getValue());
		  
	  }
	  
	   hm.replace(101, "yaqoob", "Ravi");
	   System.out.println("updated Hasmap");
 for(Map.Entry m:hm.entrySet())
	  {
		  System.out.println(m.getKey() + " " +m.getValue());
		  
	  }	 
hm.replaceAll((k,v) -> "amit");
System.out.println("updated Hasmap");
 for(Map.Entry m:hm.entrySet())
	  {
		  System.out.println(m.getKey() + " " +m.getValue());
		  
	  }	 
	  
	   
}
	}
	

