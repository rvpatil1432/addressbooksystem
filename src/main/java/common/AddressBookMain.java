package common;

import java.io.IOException;
import java.util.Scanner;

import entity.Contact;
import services.ContactImpl;

public class AddressBookMain {
	public static void main(String[] args) throws IOException {
		ContactImpl con = new ContactImpl();
		menu();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		while (choice!=4) {
			if (choice == 1)
			{
				con.readEntry(new Contact());
				System.out.println("Add Your Contact details");
				System.out.println("Enter your friend\'s firstName:");
				String firstName = sc.next();
				System.out.println("Enter your friend\'s lastName:");
				String lastName = sc.next();
				System.out.println("Enter your friend\'s address:");
				String address = sc.next();
				System.out.println("Enter your friend\'s city:");
				String city = sc.next();
				System.out.println("Enter your friend\'s state:");
				String state = sc.next();
				System.out.println("Enter your friend\'s email:");
				String email = sc.next();
				System.out.println("Enter their phone number.");
				long phoneNumber = sc.nextLong();
				System.out.println("Enter their zip code.");
				long zip = sc.nextLong();
				con.addNewContact(new Contact(firstName,lastName,address,city,state,email,phoneNumber,zip));
			}
			else if (choice == 2) {
				System.out.println("Edit Your Contact details");
				System.out.println("Enter your friend\'s firstName:");
				String firstName = sc.next();
				System.out.println("Enter your friend\'s lastName:");
				String lastName = sc.next();
				System.out.println("Enter your friend\'s address:");
				String address = sc.next();
				System.out.println("Enter your friend\'s city:");
				String city = sc.next();
				System.out.println("Enter your friend\'s state:");
				String state = sc.next();
				System.out.println("Enter your friend\'s email:");
				String email = sc.next();
				System.out.println("Enter their phone number.");
				long phoneNumber = sc.nextLong();
				System.out.println("Enter their zip code.");
				long zip = sc.nextLong();
				Contact c = new Contact(firstName, lastName, address, city, state, email, phoneNumber, zip);
				con.updatePerson(c);
			}
			else if (choice == 3) {
				System.out.println("You choosed to Quit..");
				System.exit(0);
			}
			else if (choice !=4) {
				System.out.println("Sorry, that was an invalid menu choice, try again.");
			}
			menu();
			choice = sc.nextInt();
		}
	}
	public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Edit a contact from your address book.");
		System.out.println("3.Quit.");
		System.out.println("Enter your menu choice:");
	}
}
