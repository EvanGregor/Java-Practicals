import java.util.*;

class GeneratorThread extends Thread 
{
    public void run() 
	{
		for(int number=0;number<=10;number++)
		{
			System.out.println("Generated: " + number);
			if (number % 2 == 0) 
			{
				SquareThread.square(number);
			} 
			else 
			{
				CubeThread.cube(number);
			}
				
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
    }
}

class SquareThread extends Thread 
{
    public static void square(int number) 
	{
        int square = number * number;
        System.out.println("Square: " + square);
    }
}

class CubeThread extends Thread
{
    public static void cube(int number) 
	{
        int cube = number * number * number;
        System.out.println("Cube: " + cube);
    }
}

public class prc34
{
    public static void main(String[] args) 
	{
        GeneratorThread generatorThread = new GeneratorThread();
        generatorThread.start();

        SquareThread squareThread = new SquareThread();
        squareThread.start();

        CubeThread cubeThread = new CubeThread();
        cubeThread.start();
    }
}

