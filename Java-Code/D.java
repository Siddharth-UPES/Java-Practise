/*
class D
{
	public static void main(String[] args)
	{
		String[] argh={"A","B"};
		args=argh;
		System.out.println(args.length);
		for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
	}
}
*/
/*
class D
{
	public static void main(String... args)
	{
		String[] argh={"A","B"};
		args=argh;
		for(String s: args)
		{
			System.out.println(s);
		}
	}	
}
*/
class ThreadSleepDemo1
{
	public static void main(String[] args)
	{
		myThread t = new myThread();
		t.start();
		t.interrupt();
		System.out.println("End of main method");
	}
}
class myThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println("I am lazy Thread->"+i);
		}
		System.out.println("I am entering in the sleeping  state");
		
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("I got interrupted");
		}	
	}
}

































