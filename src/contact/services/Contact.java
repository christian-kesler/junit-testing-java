//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services;

// The Contact class 
public class Contact {
	
	// class attributes
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	// variables used to verify the constructor input
	private static int contactIdMaxLength = 10;
	private static int firstNameMaxLength = 10;
	private static int lastNameMaxLength = 10;
	private static int phoneNumberRequiredLength = 10;
	private static int addressMaxLength = 30;

	// The Contact constructor
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		
		// verifying input validity and creating object
		if(verifyId(contactId) && verifyFirstName(firstName) && verifyLastName(lastName) && verifyPhoneNumber(phoneNumber) && verifyAddress(address)) {
			this.contactId = contactId;
		    this.firstName = firstName;
		    this.lastName = lastName;
		    this.phoneNumber = phoneNumber;
		    this.address = address;
	    }
	}


	// Contact Id verifier
	public static boolean verifyId(String input) {
		if(input == null || input.length()>contactIdMaxLength) {
			System.out.print("Invalid Contact Id, must be " + contactIdMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}

	// Contact First Name verifier
	public static boolean verifyFirstName(String input) {
		if(input == null || input.length()>firstNameMaxLength) {
			System.out.print("Invalid Contact First Name, must be " + firstNameMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}

	// Contact Last Name verifier
	public static boolean verifyLastName(String input) {
		if(input == null || input.length()>lastNameMaxLength) {
			System.out.print("Invalid Contact Last Name, must be " + lastNameMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}

	// Contact Phone Number verifier
	public static boolean verifyPhoneNumber(String input) {
		if(input == null || input.length()!=phoneNumberRequiredLength) {
			System.out.print("Invalid Contact Phone Number, must be " + phoneNumberRequiredLength + " characters. \n");
	    	return false;
		} else {
    	return true;
		}
	}

	// Contact Address verifier
	public static boolean verifyAddress(String input) {
		if(input == null || input.length()>addressMaxLength) {
			System.out.print("Invalid Contact Address, must be " + addressMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}

	
	// Contact Id getter
	public String getContactId() {
		return contactId;
	}

	// Contact first name getter
	public String getFirstName() {
		return firstName;
	}
	
	// Contact last name getter
	public String getLastName() {
		return lastName;
	}
	
	// Contact phone number getter
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// Contact address getter
	public String getAddress() {
		return address;
	}
	
	
	// Contact first name setter
	public static void setFirstName(Contact contact, String input) {
		if(verifyFirstName(input)) {
	    	contact.firstName = input;		
	    }
	}

	// Contact last name setter
	public static void setLastName(Contact contact, String input) {
		if(verifyLastName(input)) {
	    	contact.lastName = input;
	    }
	}
	
	// Contact phone number setter
	public static void setPhoneNumber(Contact contact, String input) {
		if(verifyPhoneNumber(input)) {
	    	contact.phoneNumber = input;
	    }
	}
	
	// Contact address setter
	public static void setAddress(Contact contact, String input) {
		if(verifyAddress(input)) {
	    	contact.address = input;
	    }
	}
}