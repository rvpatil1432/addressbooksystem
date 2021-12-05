package services;

import java.util.ArrayList;

import entity.Contact;
import interfaces.IContact;

public class ContactImpl implements IContact{

	private Contact[] friends;
    private int numfriends;
	@Override
	public void addNewContact(Contact contact){
		readEntry(contact);
	}

	@Override
	public void updatePerson(Contact contact) {
		
		readEntry(contact);
	}

	@Override
	public Contact getContactByName(String firstName) {
		
		return null;
	}

	@Override
	public void deleteByName(String firstName) {
		
		
	}

	@Override
	public void readEntry(Contact contact) {
		System.out.println("First Name:"+contact.getFirstName() );
		System.out.println("Last Name:"+contact.getLastName() );
		System.out.println("Address:"+contact.getAddress() );
		System.out.println("City:"+contact.getCity() );
		System.out.println("State:"+contact.getState() );
		System.out.println("Email:"+contact.getEmail() );
		System.out.println("Phone Number:"+contact.getPhoneNumber() );
		System.out.println("Zip:"+contact.getZip() );
	}

}
