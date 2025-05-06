class myThread extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			Thread.yield();
			System.out.println("child Thread");
			try
				{
					Thread.sleep(5000);
				}
			catch(InterruptedException e){}
			
		}
	}
}

class ThreadYieldDemo
{
	public static void main(String... args) throws
	InterruptedException
	{
		myThread t = new myThread();
		t.start();
		//t.join();
		for(int i=0;i<3;i++)
		{
			System.out.println("main Thread");
		}
	}
}
