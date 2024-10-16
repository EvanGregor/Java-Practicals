import java.io.*;

class CheckedException extends Exception{
	CheckedException(String Message){
		super(Message);
	}
	CheckedException(){
		System.out.println("Default Constructor of Checked Exception.");
	}
}

class UncheckedException extends RuntimeException{
	UncheckedException(String Message){
		super(Message);
	}
	UncheckedException(){
		System.out.println("Default Constructor of Unchecked Exception.");
	}
}

public class prc26{
	public static void main(String[] args) 
	{
		try
		{
			int x,y,z;
			x=y=0;
			z=x/y;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try 
		{
			throwCNFException();
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e);
		}
		try
		{
			int[] a={1,2,3};
			System.out.println(a[10]); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try 
		{
			throwFNFException();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e+"\n");
		}

		try
		{
			throwCheckedException("User-Defined Checked Exception - 1");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			throwCheckedException("User-Defined Checked Exception - 2");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			throw new CheckedException();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		try
		{
			throwUncheckedException("User-Defined Unchecked Exception - 1");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			throwUncheckedException("User-Defined Unchecked Exception - 2");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static void throwCNFException() throws ClassNotFoundException{
		throw new ClassNotFoundException("Pre-Defined Checked Exception : Class Not Found Exception");
	}
	static void throwFNFException() throws FileNotFoundException{
		throw new FileNotFoundException("Pre-Defined Checked Exception : File Not Found Exception");
	}
	static void throwCheckedException(String message) throws CheckedException{
		throw new CheckedException(message);
	}
	static void throwUncheckedException(String message) {
		throw new UncheckedException(message);
	}
}	
