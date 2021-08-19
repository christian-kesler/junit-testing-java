package contact.services.test;
//Christian Kesler

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import contact.services.Appointment;

class AppointmentTest {

	@Test
	void test_Appointment_Constructor_Valid() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment("0000000000", new Date(122, 10, 10, 10, 10, 10), "00000000000000000000000000000000000000000000000000");
		assertEquals(appointment.getAppointmentID(), "0000000000");
		assertEquals(appointment.getDate(), new Date(122, 10, 10, 10, 10, 10));
		assertEquals(appointment.getDescription(), "00000000000000000000000000000000000000000000000000");
	}
	
	@Test
	void test_Appointment_Constructor_InvalidID() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment("00000000000", new Date(1, 10, 10, 10, 10, 10), "3");
		assertEquals(appointment.getAppointmentID(), null);
		assertEquals(appointment.getDate(), null);
		assertEquals(appointment.getDescription(), null);
	}
	
	@Test
	void test_Appointment_Constructor_InvalidDate() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment("Java 101", new Date(1, 10, 10, 10, 10, 10), "3");
		assertEquals(appointment.getAppointmentID(), null);
		assertEquals(appointment.getDate(), null);
		assertEquals(appointment.getDescription(), null);
	}
	
	@Test
	void test_Appointment_Constructor_InvalidDescription() {
		@SuppressWarnings("deprecation")
		Appointment appointment = new Appointment("Java 101", new Date(122, 10, 10, 10, 10, 10), "000000000000000000000000000000000000000000000000000");
		assertEquals(appointment.getAppointmentID(), null);
		assertEquals(appointment.getDate(), null);
		assertEquals(appointment.getDescription(), null);
	}
}