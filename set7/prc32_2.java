import java.util.*;

class prc32_2 implements Runnable 
{
    public void run() 
	{
        System.out.println("Hello, World.(using runnable thread)");
	}
        
    public static void main(String[] args) 
	{
        prc32_2 m1 = new prc32_2();
		Thread t1=new Thread(m1);
        t1.start();
    }
}
