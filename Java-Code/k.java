class myThread extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
	
}	
class Test
{
	public static void main(String[] args)
	{
		myThread t=new myThread();
		t.start();
		System.out.println("main method");
	}
}