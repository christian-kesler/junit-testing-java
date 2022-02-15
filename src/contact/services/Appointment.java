//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services;
import java.util.Date;

// The Appointment class 
public class Appointment {
	
	// class attributes
	private String appointmentId;
	private Date date;
	private String description;
	
	// variables used to verify constructor input
	private static int appointmentIdMaxLength = 10;
	private static int descriptionMaxLength = 50;

	// The Appointment Constructor 
	public Appointment(String appointmentId, Date date, String description) {
		
		// checking for erroneous input and printing specific error message if found before creating object
		if(verifyId(appointmentId) && verifyDate(date) && verifyDescription(description)) {
			this.appointmentId = appointmentId;
			this.date = date;
			this.description = description;
		}
	}

	// Appointment Id verifier
	public static boolean verifyId(String input) {
		if(input == null || input.length()>appointmentIdMaxLength) {
			System.out.print("Invalid Appointment Id, must be " + appointmentIdMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}
	
	// Appointment Id verifier
	public static boolean verifyDate(Date input) {
		if(input == null || input.before(new Date())) {
			System.out.print("Invalid Appointment Date, must be after " + new Date() + ". \n");
	    	return false;
		} else {
    	return true;
		}
	}

	// Appointment Id verifier
	public static boolean verifyDescription(String input) {
		if(input == null || input.length()>descriptionMaxLength) {
			System.out.print("Invalid Appointment Description, must be " + descriptionMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}

	
	// appointmentId getter
	public String getAppointmentId() {
		return appointmentId;
	}

	// date getter
	public Date getDate() {
		return date;
	}
		
	// description getter
	public String getDescription() {
		return description;
	}		
}
