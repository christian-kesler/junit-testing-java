package contact.services.test;
//Christian Kesler

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import contact.services.Contact;

class ContactTest {

	@Test
	void test_Contact_Constructor_Valid() {
		Contact contact = new Contact("Java 101", "12345", "3", "1234567890", "5");
		assertEquals(contact.getContactID(), "Java 101");
		assertEquals(contact.getFirstName(), "12345");
		assertEquals(contact.getLastName(), "3");
		assertEquals(contact.getPhoneNumber(), "1234567890");
		assertEquals(contact.getAddress(), "5");
	}
	
	@Test
	void test_Contact_Constructor_InvalidID() {
		Contact contact = new Contact("tentententen", "12345", "3", "1234567890", "5");
		assertEquals(contact.getContactID(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	@Test
	void test_Contact_Constructor_InvalidFirstName() {
		Contact contact = new Contact("Java 101", "tentententen", "3", "1234567890", "5");
		assertEquals(contact.getContactID(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	@Test
	void test_Contact_Constructor_InvalidLastName() {
		Contact contact = new Contact("Java 101", "12345", "tentententen", "1234567890", "5");
		assertEquals(contact.getContactID(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	@Test
	void test_Contact_Constructor_InvalidPhoneNumber() {
		Contact contact = new Contact("Java 101", "12345", "3", "tentententen", "5");
		assertEquals(contact.getContactID(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	@Test
	void test_Contact_Constructor_InvalidDescription() {
		Contact contact = new Contact("Java 101", "12345", "3", "1234567890", "tentententententententententententen");
		assertEquals(contact.getContactID(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	@Test
	void test_Contact_Setters_Valid() {
		Contact contact = new Contact("Java 101", "12345", "3", "1234567890", "5");
		assertEquals(contact.getContactID(), "Java 101");
		Contact.setFirstName(contact, "judy");
		assertEquals(contact.getFirstName(), "judy");
		Contact.setLastName(contact, "baggins");
		assertEquals(contact.getLastName(), "baggins");
		Contact.setPhoneNumber(contact, "4567891232");
		assertEquals(contact.getPhoneNumber(), "4567891232");
		Contact.setAddress(contact, "theshire");
		assertEquals(contact.getAddress(), "theshire");
	}
	
	@Test
	void test_Contact_Setters_Invalid() {
		Contact contact = new Contact("Java 101", "12345", "3", "1234567890", "5");
		assertEquals(contact.getContactID(), "Java 101");
		Contact.setFirstName(contact, "tentententen");
		assertEquals(contact.getFirstName(), "12345");
		Contact.setLastName(contact, "tentententen");
		assertEquals(contact.getLastName(), "3");
		Contact.setPhoneNumber(contact, "tentententen");
		assertEquals(contact.getPhoneNumber(), "1234567890");
		Contact.setAddress(contact, "tentententententententententententen");
		assertEquals(contact.getAddress(), "5");
	}
}
