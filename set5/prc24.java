import java.lang.*;
import java.util.Scanner;

class prc24
{
	public static void main(String args[])
	{
		System.out.println("Enter two numbers: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(b==0)
		{
			try
			{
				int c=a/b;
				System.out.println(c);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Exception handled. "+ae.toString());
			}
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
			
	}
}
