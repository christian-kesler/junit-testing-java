package contact.services.test;
//Christian Kesler

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import contact.services.Contact;
import contact.services.ContactService;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServicesTest {
	

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
	
	@Test
	@Order(2)
	void test_FindValidEntry_ContactService() {
		Contact contact = ContactService.findContact("7");
		
		assertEquals(contact.getContactID(), "7");
		assertEquals(contact.getFirstName(), "seven");
		assertEquals(contact.getLastName(), "SEVEN");
		assertEquals(contact.getPhoneNumber(), "7777777777");
		assertEquals(contact.getAddress(), "home7");
		
		contact = ContactService.findContact("2");
		
		assertEquals(contact.getContactID(), "2");
		assertEquals(contact.getFirstName(), "two");
		assertEquals(contact.getLastName(), "TWO");
		assertEquals(contact.getPhoneNumber(), "2222222222");
		assertEquals(contact.getAddress(), "home2");
	}
		
	@Test
	@Order(3)
	void test_RemoveValidEntry_ContactService() {
		ContactService.removeContact("1");
		Contact contact = ContactService.findContact("1");
		
		assertEquals(contact, null);
	}
	
	@Test
	@Order(4)
	void test_AddInvalidEntry_ContactService() {
		ContactService.addContact("Dorotheology", 	"ONE", 			"1111111111", 		"home1");
		ContactService.addContact("two", 			"Jamesonitus", 	"2222222222", 		"home2");
		ContactService.addContact("three", 			"THREE", 		"333", 				"home3");
		ContactService.addContact("four", 			"FOUR", 		"4444444444444", 	"home4");
		ContactService.addContact("five", 			"FIVE", 		"5555555555", 		"asdasdasdasdasdasdasdasdasdasdasdasd");
	}
	
	@Test
	@Order(5)
	void test_FindInvalidEntry_ContactService() {
		Contact contact = ContactService.findContact("-1");
		
		assertEquals(contact, null);
	}
		
	@Test
	@Order(6)
	void test_RemoveInvalidEntry_ContactService() {
		ContactService.removeContact("-1");
		Contact contact = ContactService.findContact("-1");
		
		assertEquals(contact, null);
	}
	
	@Test
	@Order(7)
	void test_SetValidFirstName_ContactService() {
		Contact contact = ContactService.findContact("5");
		assertEquals(contact.getContactID(), "5");
		assertEquals(contact.getFirstName(), "five");

		ContactService.setContactFirstName("5", "Five");
		contact = ContactService.findContact("5");
		assertEquals(contact.getContactID(), "5");
		assertEquals(contact.getFirstName(), "Five");
	}
	
	@Test
	@Order(8)
	void test_SetValidLastName_ContactService() {
		Contact contact = ContactService.findContact("2");
		assertEquals(contact.getContactID(), "2");
		assertEquals(contact.getLastName(), "TWO");

		ContactService.setContactLastName("2", "tWO");
		contact = ContactService.findContact("2");
		assertEquals(contact.getContactID(), "2");
		assertEquals(contact.getLastName(), "tWO");
	}
	
	@Test
	@Order(9)
	void test_SetValidPhoneNumber_ContactService() {
		Contact contact = ContactService.findContact("3");
		assertEquals(contact.getContactID(), "3");
		assertEquals(contact.getPhoneNumber(), "3333333333");

		ContactService.setContactPhoneNumber("3", "threethree");
		contact = ContactService.findContact("3");
		assertEquals(contact.getContactID(), "3");
		assertEquals(contact.getPhoneNumber(), "threethree");
	}
	
	@Test
	@Order(10)
	void test_SetValidAddress_ContactService() {
		Contact contact = ContactService.findContact("4");
		assertEquals(contact.getContactID(), "4");
		assertEquals(contact.getAddress(), "home4");

		ContactService.setContactAddress("4", "Home4");
		contact = ContactService.findContact("4");
		assertEquals(contact.getContactID(), "4");
		assertEquals(contact.getAddress(), "Home4");
	}
	
	@Test
	@Order(11)
	void test_SetInvalidFirstName_ContactService() {
		Contact contact = ContactService.findContact("5");
		assertEquals(contact.getContactID(), "5");
		assertEquals(contact.getFirstName(), "Five");

		ContactService.setContactFirstName("5", "fivefivefive");
		contact = ContactService.findContact("5");
		assertEquals(contact.getContactID(), "5");
		assertEquals(contact.getFirstName(), "Five");
	}
	
	@Test
	@Order(12)
	void test_SetInvalidLastName_ContactService() {
		Contact contact = ContactService.findContact("2");
		assertEquals(contact.getContactID(), "2");
		assertEquals(contact.getLastName(), "tWO");

		ContactService.setContactLastName("2", "twotwotwotwo");
		contact = ContactService.findContact("2");
		assertEquals(contact.getContactID(), "2");
		assertEquals(contact.getLastName(), "tWO");
	}
	
	@Test
	@Order(13)
	void test_SetInvalidPhoneNumber_ContactService() {
		Contact contact = ContactService.findContact("3");
		assertEquals(contact.getContactID(), "3");
		assertEquals(contact.getPhoneNumber(), "threethree");

		ContactService.setContactPhoneNumber("3", "threethreethree");
		contact = ContactService.findContact("3");
		assertEquals(contact.getContactID(), "3");
		assertEquals(contact.getPhoneNumber(), "threethree");
	}
	
	@Test
	@Order(14)
	void test_SetInvalidAddress_ContactService() {
		Contact contact = ContactService.findContact("4");
		assertEquals(contact.getContactID(), "4");
		assertEquals(contact.getAddress(), "Home4");

		ContactService.setContactAddress("4", "123456789123456789123456789123456789");
		contact = ContactService.findContact("4");
		assertEquals(contact.getContactID(), "4");
		assertEquals(contact.getAddress(), "Home4");
	}

}