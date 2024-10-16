import java.util.*;

class first extends Thread
{
	public void run()
	{
		System.out.println(first.class);
	}
}

class second extends Thread
{
	public void run()
	{
		System.out.println(second.class);
	}
}

class third extends Thread
{
	public void run()
	{
		System.out.println(third.class);
	}
}

class prc36 extends Thread
{
	public static void main(String args[])
	{
		first f1=new first();
		second s1=new second();
		third t1=new third();
		f1.setPriority(3);
		s1.setPriority(5);
		t1.setPriority(7);
		f1.start();
		s1.start();
		t1.start();
	}
}
