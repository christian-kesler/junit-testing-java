//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services.test;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import contact.services.Appointment;
import contact.services.AppointmentService;

// perform the tests in the specified order
@TestMethodOrder(OrderAnnotation.class)

// The Appointment Service Test class
public class AppointmentServiceTest {	

	// Test Appointment Service constructor with valid input and create default entries for future tests
	@SuppressWarnings("deprecation")
	@Test
	@Order(1)
	void test_AppointmentService_Constructor_Valid() {
		AppointmentService.addAppointment(new Date(151, 10, 10, 10, 10, 10), 	"ONE");
		AppointmentService.addAppointment(new Date(152, 10, 10, 10, 10, 10), 	"TWO");
		AppointmentService.addAppointment(new Date(153, 10, 10, 10, 10, 10),	"THREE");
		AppointmentService.addAppointment(new Date(154, 10, 10, 10, 10, 10), 	"FOUR");
		AppointmentService.addAppointment(new Date(155, 10, 10, 10, 10, 10), 	"FIVE");
		AppointmentService.addAppointment(new Date(156, 10, 10, 10, 10, 10), 	"SIX");
		AppointmentService.addAppointment(new Date(157, 10, 10, 10, 10, 10),	"SEVEN");
		AppointmentService.addAppointment(new Date(158, 10, 10, 10, 10, 10),	"EIGHT");
		AppointmentService.addAppointment(new Date(159, 10, 10, 10, 10, 10), 	"NINE");
	}
	
	// Test Appointment Service constructor with invalid input
	@Test
	@Order(2)
	void test_AppointmentService_Constructor_Invalid() {
		AppointmentService.addAppointment(new Date(1, 10, 10, 10, 10, 10), 		"ONE");
		AppointmentService.addAppointment(new Date(151, 10, 10, 10, 10, 10), 	"000000000000000000000000000000000000000000000000000");
	}
		
	// Test Appointment Service finder with valid query
	@Test
	@Order(3)
	void test_AppointmentService_Finder_Valid() {
		Appointment appointment = AppointmentService.findAppointment("7");
		
		assertEquals(appointment.getAppointmentId(), "7");
		assertEquals(appointment.getDate(), new Date(157, 10, 10, 10, 10, 10));
		assertEquals(appointment.getDescription(), "SEVEN");
		
		appointment = AppointmentService.findAppointment("2");
		
		assertEquals(appointment.getAppointmentId(), "2");
		assertEquals(appointment.getDate(), new Date(152, 10, 10, 10, 10, 10));
		assertEquals(appointment.getDescription(), "TWO");
	}
			
	// Test Appointment Service finder with invalid query
	@Test
	@Order(4)
	void test_AppointmentService_Finder_Invalid() {
		Appointment appointment = AppointmentService.findAppointment("-1");
		
		assertEquals(appointment, null);
	}
	
	// Test Appointment Service remover with valid query
	@Test
	@Order(5)
	void test_AppointmentService_Remover_Valid() {
		AppointmentService.removeAppointment("1");
		Appointment appointment = AppointmentService.findAppointment("1");
		
		assertEquals(appointment, null);
	}

	// Test Appointment Service remover with invalid query
	@Test
	@Order(6)
	void test_AppointmentService_Remover_Invalid() {
		AppointmentService.removeAppointment("-1");
		Appointment appointment = AppointmentService.findAppointment("-1");
		
		assertEquals(appointment, null);
	}
}