class Test 
{
	public static void main(String... args)
	{
		myThread t = new myThread();
		t.start();
		Thread.currentThread().setName("Siddharth");
		System.out.println("main method executed by Thread :"+Thread.currentThread().getName());
	}
}
class myThread extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("Hello");
		System.out.println("run method execute by Thread:"+Thread.currentThread().getName() );
	}
}