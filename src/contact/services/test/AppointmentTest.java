//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services.test;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.Test;
import contact.services.Appointment;

// The Appointment Test class
class AppointmentTest {

	// variables that serve as input for tests
	private String validId = "123456789";
	private Date validDate = new Date(122, 10, 10, 10, 10, 10);
	private String validDescription = "An appointment for back pain";
	
	private String invalidId = "111222333444555";
	private Date invalidDate = new Date(1, 10, 10, 10, 10, 10);
	private String invalidDescription = "an appointment for extreme lower abdominal pain that originates from a stilted gait";

	// Test Appointment constructor with all valid input
	@Test
	void test_Appointment_Constructor_Valid() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment(validId, validDate, validDescription);
		assertEquals(appointment.getAppointmentId(), validId);
		assertEquals(appointment.getDate(), validDate);
		assertEquals(appointment.getDescription(), validDescription);
	}
	
	// Test Appointment constructor with invalid Id
	@Test
	void test_Appointment_Constructor_InvalidId() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment(invalidId, validDate, validDescription);
		assertEquals(appointment.getAppointmentId(), null);
		assertEquals(appointment.getDate(), null);
		assertEquals(appointment.getDescription(), null);
	}
	
	// Test Appointment constructor with invalid date
	@Test
	void test_Appointment_Constructor_InvalidDate() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment(validId, invalidDate, validDescription);
		assertEquals(appointment.getAppointmentId(), null);
		assertEquals(appointment.getDate(), null);
		assertEquals(appointment.getDescription(), null);
	}
	
	// Test Appointment constructor with invalid description
	@Test
	void test_Appointment_Constructor_InvalidDescription() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment(validId, validDate, invalidDescription);
		assertEquals(appointment.getAppointmentId(), null);
		assertEquals(appointment.getDate(), null);
		assertEquals(appointment.getDescription(), null);
	}
}