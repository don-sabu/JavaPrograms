class IntegerThread implements Runnable
{
	String name;
	Thread t;
	IntegerThread(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		t.start();
	}
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread 1: "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				System.out.println("Thread 1 interupted");
			}
		}
		System.out.println("Exiting THREAD 1");
	}
}
class CharacterThread implements Runnable
{
	String name;
	Thread t;
	CharacterThread(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		t.start();
	}
	@Override
	public void run()
	{
		for(int i=65;i<=69;i++)
		{
			System.out.println("Thread 2: "+((char)i));
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				System.out.println("Thread 2 interupted");
			}
		}
		System.out.println("Exiting THREAD 2");
	}	
}
public class Multithreading
{
	public static void main(String[] args)
	{
		System.out.println("Entering MAIN THREAD");
		IntegerThread ob1 = new IntegerThread("Thread 1");
		CharacterThread ob2 = new CharacterThread("Thread 2");
		try
		{
			Thread.sleep(1000);
			ob1.t.suspend();
			System.out.println("Thread 1 suspended");
			Thread.sleep(2000);
			System.out.println("Resuming Thread 1");
			ob1.t.resume();
			ob2.t.suspend();
			System.out.println("Thread 2 suspended");
			Thread.sleep(2000);
			System.out.println("Resuming Thread 2");
			ob2.t.resume();
			ob1.t.join();
			ob2.t.join();
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread interupted");
		}
		System.out.println("Exiting MAIN THREAD");
	}
}