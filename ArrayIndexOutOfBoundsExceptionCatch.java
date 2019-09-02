public class ArrayIndexOutOfBoundsExceptionCatch //Soham Nagaokar
{
	public static void main ( String [] args ) /* Program will reference an array index that is out of bounds, resulting in the appropriate exception, causing an error
	message */
	{
		try
		{
			int [] myArray = new int[3]; //creates int array
			int a = myArray[-1]; //references nonexsistent array index of -1, creating the exception
		}
		catch( ArrayIndexOutOfBoundsException e ) //catches ArrayIndexOutOfBounds Exceptions and displays an appropriate error message
		{
			System.out.println( "ERROR: Array Index Out Of Bounds." );
			System.out.println( "Array index -1 doesn't exist." );
		}
	}
}