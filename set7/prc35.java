import java.util.*;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class prc35
{
	public static void main(String args[])
	{
		MyThread t=new MyThread();
		t.start();
	}
}

