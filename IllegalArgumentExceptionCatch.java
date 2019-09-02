public class IllegalArgumentExceptionCatch //Soham Nagaokar
{
	public static void main ( String [] args ) /* Program will attempt to convert int -1 to a character, which is impossible, thus generating an exception. This exception
	is caught, and an error message is displayed */
	{
		try {Character.toChars(-1);} //attempts to convert int -1 to a character, generating an exception
		catch( IllegalArgumentException e ) //exception is caught and error message is displayed
		{
			System.out.println( "ERROR: Illegal Argument Detected." );
			System.out.println( "Integers cannot be converted to characters." );
		}
	}
}