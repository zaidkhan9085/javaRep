class Odd extends Thread
{
	synchronized void printOddNO(int n)
	{
		for (int i =1;i<=n;i++)
		{
	if(i%2!=0)
	{
			System.out.println(i);
			try{
				Thread.sleep(500);
				
			}catch(Exception e){System.out.print(e);}
	}
		}
	}
	}
	class Thread1 extends Thread
	{
		Odd o;
		Thread1(Odd o)
		{
			this.o=o;
		}
		public void run()
		{
			o.printOddNO(10);
		}
	}
	class Thread2 extends Thread
	{
		Odd o;
		Thread2(Odd o)
		{
			this.o=o;
		}
		public void run()
		{
			o.printOddNO(20);
		}
	}
	public class SynchThread
	{
		public static void main(String [] args)
		{
			Odd obj = new Odd();
			Thread1 t1 = new Thread1(obj);
			Thread2 t2 = new Thread2(obj);
			t1.start();
			t2.start();
		}
	}