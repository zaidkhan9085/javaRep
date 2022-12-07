class ThreadSchedularLab extends Thread
{
	String [] strArr = {"z","a","i","d"};
	String [] strArr2 = {"k","h","a","n"};
	public void run()
	{
		for(String x : strArr)
		{
		
		try{Thread.sleep(1000);}
		catch(Exception e)
		{System.out.println(e);}
		System.out.println(x);
		}
		
		for(String x : strArr2)
		{
		
		try{Thread.sleep(1000);}
		catch(Exception e)
		{System.out.println(e);}
		System.out.println(x);
		}
	}
	public static void main(String args[])
	{
		
		ThreadSchedularLab s1 = new ThreadSchedularLab();
		ThreadSchedularLab s2 = new ThreadSchedularLab();
		ThreadSchedularLab s3 = new ThreadSchedularLab();
s1.start();

	try{s1.join();}
		catch(Exception e)
		{System.out.println(e);}
s2.start();
		s3.start();
	}
}
/*
class TestJoinMethod1 extends Thread
{  
 public void run()
{  
  for(int i=1;i<=5;i++)
{  
   try{  
    Thread.sleep(1000);  
   }catch(Exception e)
{System.out.println(e);
}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[])
{  
 TestJoinMethod1 t1=new TestJoinMethod1();  
 TestJoinMethod1 t2=new TestJoinMethod1();  
 TestJoinMethod1 t3=new TestJoinMethod1();  
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);
}  
  
 t2.start();  
 t3.start();  
 }  
}  
*/