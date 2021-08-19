package contact.services;
//Christian Kesler

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if(contactID == null || contactID.length()>10) {
			System.out.print("Invalid contact id. \n");
	    } else if(firstName == null || firstName.length()>10) {
	    	System.out.print("Invalid first name. \n");
	    } else if(lastName == null || lastName.length()>10) {
	    	System.out.print("Invalid last name. \n");
	    } else if(phoneNumber == null || phoneNumber.length()!=10) {
	    	System.out.print("Invalid phone number. \n");
	    } else if(address == null || address.length()>30) {
	    	System.out.print("Invalid address. \n");
	    } else {
		    this.contactID = contactID;
		    this.firstName = firstName;
		    this.lastName = lastName;
		    this.phoneNumber = phoneNumber;
		    this.address = address;
	    }
	}

	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	
	
	public static void setFirstName(Contact contact, String input) {
		if(input == null || input.length()>10) {
	    	System.out.print("Invalid first name. \n");
	    } else {
	    	contact.firstName = input;		
	    }
	}
	
	public static void setLastName(Contact contact, String input) {
		if(input == null || input.length()>10) {
	    	System.out.print("Invalid last name. \n");
	    } else {
	    	contact.lastName = input;
	    }
	}
	
	public static void setPhoneNumber(Contact contact, String input) {
		if(input == null || input.length()!=10) {
	    	System.out.print("Invalid phone number. \n");
	    } else {
	    	contact.phoneNumber = input;
	    }
	}
	public static void setAddress(Contact contact, String input) {
		if(input == null || input.length()>30) {
	    	System.out.print("Invalid address. \n");
	    } else {
	    	contact.address = input;
	    }
	}
}