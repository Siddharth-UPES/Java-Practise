/*
class G
{
	public static void methodOne(int... x)
	{
		System.out.println("var-arg methods");
	}
	public static void main(String[] args)
	{
		methodOne();
		methodOne(10);
		methodOne(10,20,30);
	}
	
}
*/

class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread1 starts execution of d1() method");
		try
		{
			Thread.sleep(6000);
		}
		catch (InterruptedException e){}
		System.out.println("Thread1 trying to call B's last ()");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A1,this is last() method");
	}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread 2 starts execution of d2() method");
		try	
		{
			Thread.sleep(6000);
		}
		catch(InterruptedException e){}
		System.out.println("Thread2 trying to call A's last()");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B, this is last() method");
	
	}
}
class DeadLock1 extends Thread
{
	A a=new A();
	B b=new B(); 
	public void m1()
	{
		this.start();
		a.d1(b);
	}
	public void run()
	{
	 b.d2(a);
	}
	public static void main(String[] args)
	{
		DeadLock1 d=new DeadLock1 ();
		d.m1();
	}
}






















