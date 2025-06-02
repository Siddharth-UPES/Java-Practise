class myThread extends Thread
{}
class ThreadDemo
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		myThread t =new myThread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Siddharth");
		System.out.println(Thread.currentThread().getName());
	
	}
}