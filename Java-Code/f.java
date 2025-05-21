/*
class F
{
	public static void main (String...  args)
	{
		int x;
		System.out.println("hello");
	}
}
*/

/*
class F
{
	public static void main(String... args)
	{
		int x;
		if(args.length>0)
		{	
			x=10;
		}
		else
		{
			x=20;
		}
		System.out.println(x);
	}
}
*/

class A
{
	public synchronized void food(B b)
	{
		System.out.println("Thread1 starts execution of food() method");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e){}
		System.out.println("Thread1 trying to call b.last()");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A, this is last()method");
	}
}
class B
{
	public synchronized void bar(A a)
	{
		System.out.println("Thread2 starts execution of bar() method");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e){}
		System.out.println("Thread2 trying to call a.last()");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B,this is last() method");
	}
}
class DeadLock implements Runnable
{
	A a=new A();
	B b=new B();
	DeadLock()
	{
		Thread t = new Thread(this);
		t.start();
		a.food(b);
	}
	public void run()
	{
		b.bar(a);
	}
	public static void main(String[] args)
	{
		new DeadLock();// if we  not comment this line we will get always deadlock problem
	}
}




















