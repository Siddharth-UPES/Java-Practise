/*class B 
{
	public static void main(String[] args)
	{
		int[] a={10,20,30};
		System.out.println(a);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}*/

 
/*
import java.util.Arrays;
class B
{
	public static void main(String[] args)
	{
		char[] ch={'a','b','c'};
		String[] s={"Ram","Shyam","Mohan"};
		System.out.println(ch);
		System.out.println(Arrays.toString(s));
	}
}

*/

class ThreadJoinDemo1
{
	public static void main(String... args) throws
	InterruptedException
	{
		myThread mt = Thread.currentThread();
		myThread t = new myThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			System.out.println("main Thread");
		}
	}
}
class myThread extends Thread
{
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e){}
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}























