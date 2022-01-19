//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services.test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import contact.services.Contact;
import contact.services.ContactService;

//perform the tests in the specified order
@TestMethodOrder(OrderAnnotation.class)

//The Contact Service Test class
public class ContactServicesTest {
	
	// Test Contact Service constructor with valid input and create default entries for future tests
	@Test
	@Order(1)
	void test_AddValidEntry_ContactService() {
		ContactService.addContact("one", 	"ONE", 	"1111111111", "home1");
		ContactService.addContact("two", 	"TWO", 	"2222222222", "home2");
		ContactService.addContact("three", 	"THREE","3333333333", "home3");
		ContactService.addContact("four", 	"FOUR", "4444444444", "home4");
		ContactService.addContact("five", 	"FIVE", "5555555555", "home5");
		ContactService.addContact("six", 	"SIX", 	"6666666666", "home6");
		ContactService.addContact("seven", 	"SEVEN","7777777777", "home7");
		ContactService.addContact("eight", 	"EIGHT","8888888888", "home8");
		ContactService.addContact("nine", 	"NINE", "9999999999", "home9");
	}
	
	// Test Contact Service constructor with invalid input
	@Test
	@Order(2)
	void test_AddInvalidEntry_ContactService() {
		ContactService.addContact("Dorotheology", 	"ONE", 			"1111111111", 		"home1");
		ContactService.addContact("two", 			"Jamesonitus", 	"2222222222", 		"home2");
		ContactService.addContact("three", 			"THREE", 		"333", 				"home3");
		ContactService.addContact("four", 			"FOUR", 		"4444444444444", 	"home4");
		ContactService.addContact("five", 			"FIVE", 		"5555555555", 		"asdasdasdasdasdasdasdasdasdasdasdasd");
	}

	// Test Contact Service finder with valid query
	@Test
	@Order(3)
	void test_FindValidEntry_ContactService() {
		Contact contact = ContactService.findContact("7");
		
		assertEquals(contact.getContactId(), "7");
		assertEquals(contact.getFirstName(), "seven");
		assertEquals(contact.getLastName(), "SEVEN");
		assertEquals(contact.getPhoneNumber(), "7777777777");
		assertEquals(contact.getAddress(), "home7");
		
		contact = ContactService.findContact("2");
		
		assertEquals(contact.getContactId(), "2");
		assertEquals(contact.getFirstName(), "two");
		assertEquals(contact.getLastName(), "TWO");
		assertEquals(contact.getPhoneNumber(), "2222222222");
		assertEquals(contact.getAddress(), "home2");
	}
		
	// Test Contact Service finder with invalid query
	@Test
	@Order(4)
	void test_FindInvalidEntry_ContactService() {
		Contact contact = ContactService.findContact("-1");
		
		assertEquals(contact, null);
	}

	// Test Contact Service remover with valid query
	@Test
	@Order(5)
	void test_RemoveValidEntry_ContactService() {
		ContactService.removeContact("1");
		Contact contact = ContactService.findContact("1");
		
		assertEquals(contact, null);
	}
		
	// Test Contact Service remover with invalid query
	@Test
	@Order(6)
	void test_RemoveInvalidEntry_ContactService() {
		ContactService.removeContact("-1");
		Contact contact = ContactService.findContact("-1");
		
		assertEquals(contact, null);
	}
	
	// Test Contact Service setter with valid first name
	@Test
	@Order(7)
	void test_SetValidFirstName_ContactService() {
		Contact contact = ContactService.findContact("5");
		assertEquals(contact.getContactId(), "5");
		assertEquals(contact.getFirstName(), "five");

		ContactService.setContactFirstName("5", "Five");
		contact = ContactService.findContact("5");
		assertEquals(contact.getContactId(), "5");
		assertEquals(contact.getFirstName(), "Five");
	}
	
	// Test Contact Service setter with valid last name
	@Test
	@Order(8)
	void test_SetValidLastName_ContactService() {
		Contact contact = ContactService.findContact("2");
		assertEquals(contact.getContactId(), "2");
		assertEquals(contact.getLastName(), "TWO");

		ContactService.setContactLastName("2", "tWO");
		contact = ContactService.findContact("2");
		assertEquals(contact.getContactId(), "2");
		assertEquals(contact.getLastName(), "tWO");
	}
	
	// Test Contact Service setter with valid phone number
	@Test
	@Order(9)
	void test_SetValidPhoneNumber_ContactService() {
		Contact contact = ContactService.findContact("3");
		assertEquals(contact.getContactId(), "3");
		assertEquals(contact.getPhoneNumber(), "3333333333");

		ContactService.setContactPhoneNumber("3", "threethree");
		contact = ContactService.findContact("3");
		assertEquals(contact.getContactId(), "3");
		assertEquals(contact.getPhoneNumber(), "threethree");
	}
	
	// Test Contact Service setter with valid address
	@Test
	@Order(10)
	void test_SetValidAddress_ContactService() {
		Contact contact = ContactService.findContact("4");
		assertEquals(contact.getContactId(), "4");
		assertEquals(contact.getAddress(), "home4");

		ContactService.setContactAddress("4", "Home4");
		contact = ContactService.findContact("4");
		assertEquals(contact.getContactId(), "4");
		assertEquals(contact.getAddress(), "Home4");
	}
	
	// Test Contact Service setter with invalid first name
	@Test
	@Order(11)
	void test_SetInvalidFirstName_ContactService() {
		Contact contact = ContactService.findContact("5");
		assertEquals(contact.getContactId(), "5");
		assertEquals(contact.getFirstName(), "Five");

		ContactService.setContactFirstName("5", "fivefivefive");
		contact = ContactService.findContact("5");
		assertEquals(contact.getContactId(), "5");
		assertEquals(contact.getFirstName(), "Five");
	}
	
	// Test Contact Service setter with invalid last name
	@Test
	@Order(12)
	void test_SetInvalidLastName_ContactService() {
		Contact contact = ContactService.findContact("2");
		assertEquals(contact.getContactId(), "2");
		assertEquals(contact.getLastName(), "tWO");

		ContactService.setContactLastName("2", "twotwotwotwo");
		contact = ContactService.findContact("2");
		assertEquals(contact.getContactId(), "2");
		assertEquals(contact.getLastName(), "tWO");
	}
	
	// Test Contact Service setter with invalid phone number
	@Test
	@Order(13)
	void test_SetInvalidPhoneNumber_ContactService() {
		Contact contact = ContactService.findContact("3");
		assertEquals(contact.getContactId(), "3");
		assertEquals(contact.getPhoneNumber(), "threethree");

		ContactService.setContactPhoneNumber("3", "threethreethree");
		contact = ContactService.findContact("3");
		assertEquals(contact.getContactId(), "3");
		assertEquals(contact.getPhoneNumber(), "threethree");
	}
	
	// Test Contact Service setter with invalid address
	@Test
	@Order(14)
	void test_SetInvalidAddress_ContactService() {
		Contact contact = ContactService.findContact("4");
		assertEquals(contact.getContactId(), "4");
		assertEquals(contact.getAddress(), "Home4");

		ContactService.setContactAddress("4", "123456789123456789123456789123456789");
		contact = ContactService.findContact("4");
		assertEquals(contact.getContactId(), "4");
		assertEquals(contact.getAddress(), "Home4");
	}

}