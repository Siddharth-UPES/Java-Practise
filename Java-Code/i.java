
class myThread extends Thread
{}
class ThreadDemo
{
	public static void main(String... args)
	{
		myThread t= new myThread();
		t.start();
	}
}