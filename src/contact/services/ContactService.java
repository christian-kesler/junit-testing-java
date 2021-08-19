package contact.services;
//Christian Kesler

import java.util.Vector;

public class ContactService {
	public static int intID = 1;
	
	static Vector<Contact> ContactList = new Vector<Contact>(0);

	public static void addContact(String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(Integer.toString(intID), firstName, lastName, phoneNumber, address);
		ContactList.add(contact);
		++intID;
	}
	
	public static void removeContact(String contactID) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactID() != null) {
				if (ContactList.get(i).getContactID().equals(contactID)) {
					ContactList.remove(i);
				}
			}
		}
	}
	public static Contact findContact(String contactID) {
		Contact contact = null;
		for (int i = 0; i < ContactList.size(); ++i) {
//			System.out.print("The size of the array: " + ContactList.size() + "\n");
//			System.out.print("The ID we are looking for: " + contactID + "\n");
//			System.out.print("The ID the loop has found: " + ContactList.get(i).getContactID() + "\n");
			if (ContactList.get(i).getContactID() != null) {
				if (ContactList.get(i).getContactID().equals(contactID)) {
//					System.out.print("The contact the loop likes: " + ContactList.get(i) + "\n");
					contact = ContactList.get(i);
//					System.out.print("The contact the loop assigned: " + contact + "\n");
				}
			}
		}
		return contact;
	}
	
	public static void setContactFirstName(String contactID, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactID() != null) {
				if (ContactList.get(i).getContactID().equals(contactID)) {
					Contact.setFirstName(ContactList.get(i), input);
				}
			}
		}
	}
	
	public static void setContactLastName(String contactID, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactID() != null) {
				if (ContactList.get(i).getContactID().equals(contactID)) {
					Contact.setLastName(ContactList.get(i), input);
				}
			}
		}
	}
	
	public static void setContactPhoneNumber(String contactID, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactID() != null) {
				if (ContactList.get(i).getContactID().equals(contactID)) {
					Contact.setPhoneNumber(ContactList.get(i), input);
				}
			}
		}
	}
	
	public static void setContactAddress(String contactID, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactID() != null) {
				if (ContactList.get(i).getContactID().equals(contactID)) {
					Contact.setAddress(ContactList.get(i), input);
				}
			}
		}
	}
}




