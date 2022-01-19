//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services.test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import contact.services.Contact;

// The Contact Test class
class ContactTest {

	// variables that serve as input for tests
	private String validId = "123456789";
	private String validFirstName = "Robert";
	private String validLastName = "Morrison";
	private String validPhoneNumber = "3235157894";
	private String validAddress = "800 Weinburg Circle";
	
	private String invalidId = "111222333444555";
	private String invalidFirstName = "Siegfriedeumond";
	private String invalidLastName = "Dushenchieztansa";
	private String invalidPhoneNumber = "320320320320";
	private String invalidAddress = "tentententententententententententen";
	
	private String validFirstNameTemp = "Judy";
	private String validLastNameTemp = "Robinson";
	private String validPhoneNumberTemp = "9998887766";
	private String validAddressTemp = "789 Woundoun Road";

	// Test Contact constructor with all valid input
	@Test
	void test_Contact_Constructor_Valid() {
		Contact contact = new Contact(validId, validFirstName, validLastName, validPhoneNumber, validAddress);
		assertEquals(contact.getContactId(), validId);
		assertEquals(contact.getFirstName(), validFirstName);
		assertEquals(contact.getLastName(), validLastName);
		assertEquals(contact.getPhoneNumber(), validPhoneNumber);
		assertEquals(contact.getAddress(), validAddress);
	}
	
	// Test Contact constructor with invalid Id
	@Test
	void test_Contact_Constructor_InvalidId() {
		Contact contact = new Contact(invalidId, validFirstName, validLastName, validPhoneNumber, validAddress);
		assertEquals(contact.getContactId(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	// Test Contact constructor with invalid first name
	@Test
	void test_Contact_Constructor_InvalidFirstName() {
		Contact contact = new Contact(validId, invalidFirstName, validLastName, validPhoneNumber, validAddress);
		assertEquals(contact.getContactId(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	// Test Contact constructor with invalid last name
	@Test
	void test_Contact_Constructor_InvalidLastName() {
		Contact contact = new Contact(validId, validFirstName, invalidLastName, validPhoneNumber, validAddress);
		assertEquals(contact.getContactId(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	// Test Contact constructor with invalid phone number
	@Test
	void test_Contact_Constructor_InvalidPhoneNumber() {
		Contact contact = new Contact(validId, validFirstName, validLastName, invalidPhoneNumber, validAddress);
		assertEquals(contact.getContactId(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	// Test Contact constructor with invalid address
	@Test
	void test_Contact_Constructor_InvalidDescription() {
		Contact contact = new Contact(validId, validFirstName, validLastName, validPhoneNumber, invalidAddress);
		assertEquals(contact.getContactId(), null);
		assertEquals(contact.getFirstName(), null);
		assertEquals(contact.getLastName(), null);
		assertEquals(contact.getPhoneNumber(), null);
		assertEquals(contact.getAddress(), null);
	}
	
	// Test Contact setters with all valid input
	@Test
	void test_Contact_Setters_Valid() {
		Contact contact = new Contact(validId, validFirstNameTemp, validLastNameTemp, validPhoneNumberTemp, validAddressTemp);
		assertEquals(contact.getContactId(), validId);
		Contact.setFirstName(contact, validFirstName);
		assertEquals(contact.getFirstName(), validFirstName);
		Contact.setLastName(contact, validLastName);
		assertEquals(contact.getLastName(), validLastName);
		Contact.setPhoneNumber(contact, validPhoneNumber);
		assertEquals(contact.getPhoneNumber(), validPhoneNumber);
		Contact.setAddress(contact, validAddress);
		assertEquals(contact.getAddress(), validAddress);
	}
	
	// Test Contact setters with all invalid input
	@Test
	void test_Contact_Setters_Invalid() {
		Contact contact = new Contact(validId, validFirstName, validLastName, validPhoneNumber, validAddress);
		assertEquals(contact.getContactId(), validId);
		Contact.setFirstName(contact, invalidFirstName);
		assertEquals(contact.getFirstName(), validFirstName);
		Contact.setLastName(contact, invalidLastName);
		assertEquals(contact.getLastName(), validLastName);
		Contact.setPhoneNumber(contact, invalidPhoneNumber);
		assertEquals(contact.getPhoneNumber(), validPhoneNumber);
		Contact.setAddress(contact, invalidAddress);
		assertEquals(contact.getAddress(), validAddress);
	}
}
