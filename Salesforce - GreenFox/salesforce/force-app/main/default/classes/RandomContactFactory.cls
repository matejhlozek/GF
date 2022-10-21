public class RandomContactFactory
{
	public static List<Contact> generateRandomContacts( Integer numberOfContacts, String lastName )
	{
		List<Contact> contacts = new List<Contact>();
		
		for( Integer i = 0; i < numberOfContacts; i++ )
		{
			Contact con = new Contact( FirstName = 'Test '+i, LastName = lastName );
			contacts.add( con );
		}
		
		return contacts;
	}
}