class ThreadLab1 extends Thread
{
public void run()
{
	System.out.println("current thread is "+Thread.currentThread().getName());
}
public static void main(String [] args)
{
ThreadLab1 l1 = new ThreadLab1();
Thread t1 = new Thread (l1);
t1.setName("myThread");
t1.start();

}
}