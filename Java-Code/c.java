/*
class C{
	public static void main(String[] args){
		System.out.println(sum(new int[] {10,20,30,40}));
	}
	public static int sum(int[] x){
		int total=0;
		for(int x1:x){
			total+=x1;
		}
		return total;
	}
}
*/
/*
import java.util.Arrays;

class D {
    public static void main(String[] args) {
        Object[] a = new Object[10];
        a[0] = new Integer(10);
        a[1] = new Object();
        a[2] = new String("Sonam");

        System.out.println(Arrays.toString(a));
    }   
}
*/


/*
class slideRotator
{
	public static void main(String... args) throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Slide ->"+i);
			Thread.sleep(5000);
		}
	}
}
*/

class ThreadSleepDemo
{
	public static void main(String... agrs)
	{
		myThread t =new  myThread();
		t.start();
		//t.interrupt(); // while commenting main thread won't be interrupted child thread
		System.out.println("End of main Thread");
	}
}
class myThread extends Thread
{
	public void run()
	{
		try{
				for(int i=0;i<10;i++)
				{
					System.out.println("I am lazy Thread");
					Thread.sleep(2000);
				}
			}
		catch (InterruptedException e)
		{
			System.out.println("I got interrupted");
		}
	}
}























