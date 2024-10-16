import java.util.*;

class prc32_1 extends Thread
{
	public void run()
	{
		System.out.println("Hello, World.(using Thread class)");
	}
	
	public static void main(String args[])
	{
		prc32_1 t=new prc32_1();
		t.start();
	}
}
