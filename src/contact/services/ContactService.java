//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services;
import java.util.Vector;

// The Contact Service class 
public class ContactService {
	public static int intId = 1;
	
	// New Vector ContactList is created to store Contacts
	static Vector<Contact> ContactList = new Vector<Contact>(0);

	// Add Contact method to Contact Service  
	public static void addContact(String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(Integer.toString(intId), firstName, lastName, phoneNumber, address);
		ContactList.add(contact);
		++intId;
	}
	
	// Remove Contact method from Contact Service  
	public static void removeContact(String contactId) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactId() != null) {
				if (ContactList.get(i).getContactId().equals(contactId)) {
					ContactList.remove(i);
				}
			}
		}
	}
	
	// Find Contact method in Contact Service  
	public static Contact findContact(String contactId) {
		Contact contact = null;
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactId() != null) {
				if (ContactList.get(i).getContactId().equals(contactId)) {
					contact = ContactList.get(i);
				}
			}
		}
		return contact;
	}
	
	// Set Contact First Name method in Contact Service
	public static void setContactFirstName(String contactId, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactId() != null) {
				if (ContactList.get(i).getContactId().equals(contactId)) {
					Contact.setFirstName(ContactList.get(i), input);
				}
			}
		}
	}
	
	// Set Contact Last Name method in Contact Service
	public static void setContactLastName(String contactId, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactId() != null) {
				if (ContactList.get(i).getContactId().equals(contactId)) {
					Contact.setLastName(ContactList.get(i), input);
				}
			}
		}
	}
	
	// Set Contact Phone Number method in Contact Service
	public static void setContactPhoneNumber(String contactId, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactId() != null) {
				if (ContactList.get(i).getContactId().equals(contactId)) {
					Contact.setPhoneNumber(ContactList.get(i), input);
				}
			}
		}
	}
	
	// Set Contact Address method in Contact Service
	public static void setContactAddress(String contactId, String input) {
		for (int i = 0; i < ContactList.size(); ++i) {
			if (ContactList.get(i).getContactId() != null) {
				if (ContactList.get(i).getContactId().equals(contactId)) {
					Contact.setAddress(ContactList.get(i), input);
				}
			}
		}
	}
}