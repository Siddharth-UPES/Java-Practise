class ThreadGroupDemo
{
	public static void main(String[] args)throws InterruptedException
	{
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup("Child Group");
		myThread t1= new myThread(pg,"Parent Group");
		myThread t2=new myThread(cg,"Child Group");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(cg.activeGroupCount());
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		pg.list();
	}

}
class myThread extends Thread
	{
		myThread(ThreadGroup g, String name)
		{
			super(g,name);
		}
		public void run()
		{
			System.out.println("Child Thread");
			try{
					Thread.sleep(3000);
				}
		catch (InterruptedException e){}
		}
		
	}











