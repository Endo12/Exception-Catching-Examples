public class NullPointerExceptionCatch //Soham Nagaokar
{
	public static void main ( String [] args ) //Program attempts to print a null statement, resulting in a nullpointerexception, then causing an error message
	{
		try
		{
			Object s = null; //Object s is initialized, and is null
			s.toString(); //Program attempts to print string, but since the object is null, exception occurs
		}
		catch( NullPointerException e ) //exception is caught and error message is printed
		{
			System.out.println( "ERROR: Null Value." );
			System.out.println( "toString() cannot be enacted on null objects." );
		}
	}
}