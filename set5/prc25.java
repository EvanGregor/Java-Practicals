public class prc25
{
	public static void main(String[] args)
	{
		try
		{
			throwMethod();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void throwMethod()
	{
		throw new ArithmeticException("User Thrown Exception");
	}
}
