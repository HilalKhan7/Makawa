package LabWork;

public class ExceptionHandle {

	public static void main(String[] args) 
	{
		int a[]=new int[2];
		
		try
		{
			System.out.println("Access value = "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exceptionThrown = "+e);
		}
		finally
		{
			a[0]=2;
			System.out.println("First value = "+a[0]);
		}

	}

}
