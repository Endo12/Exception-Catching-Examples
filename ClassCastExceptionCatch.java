public class ClassCastExceptionCatch //Soham Nagaokar
{
	public static void main ( String [] args ) /* Program casts Object s as a Dog type, then attempts to recast it as a Car, causing the exception. The exception is
	then caught and an error message is displayed. For simplicity sake, I simply used the Sounds interface, along with the animal, vehicle, dog, and car classes 
	from assignment 3 */
	{
		try
		{
			Object s = new Dog(); //Object s is cast to subclass Dog
			( (Car) s ).makeSound(); //The program attempts to cast s to subclass Car, which is impossible, causing the exception
		}
		catch( ClassCastException e ) //ClassCastException is caught and error message is displayed
		{
			System.out.println( "ERROR: Class Incorrectly Cast." );
			System.out.println( "Dog s is cast to a subclass not in its inheritance path." );
		} 
	}
}