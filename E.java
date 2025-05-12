/*
class E
{
	int i=10;
	public static void main(String... args)
	{	
		
		E  a=new E();// object creation 
		System.out.println(a.i);
		a.methodOne();
	}
	public void methodOne()
	{
		System.out.println(i);
	}
}*/

/*
class E
{
	public static void main(String[] args)
	{
		int i =0;
		for (int j=2;j<=5;j++)
		{
			i=i+j;
		
		System.out.println(i+"----------"+j);}
	}
}

*/
class SynchronizedDemo
	{
		public static void main(String... args)
		{
			Display d1=new Display();
			Display d2 =new Display();
			myThread t1=new myThread(d1,"Siddharth");
			myThread t2=new myThread(d2,"Siddhant");
			t1.start();
			t2.start();
	}
}

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Good Morning->");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e){}
			System.out.println(name);
		}
	}
}
class myThread extends Thread
{
	Display d;
	String name;

	myThread(Display d,String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}	
}





















