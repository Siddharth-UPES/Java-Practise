class ThreadDemo
{
	public static void main(String... args)
	{
		myThread t = new myThread();
		Thread t1=new Thread(t);
		t1.start();
		System.out.println("main Thread");
	}
}
class myThread extends Thread 
{
	public void run()
	{
		System.out.println("Child Thread");
	}
}
