package interfaces;

import entity.Contact;

public interface IContact 
{
	public void addNewContact(Contact contact);

	public void updatePerson(Contact contact);

	public Contact getContactByName(String firstName);

	public void deleteByName(String firstName);
	
	public void readEntry(Contact contact);
}
