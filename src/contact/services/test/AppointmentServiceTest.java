package contact.services.test;
//Christian Kesler

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import contact.services.Appointment;
import contact.services.AppointmentService;

@TestMethodOrder(OrderAnnotation.class)
public class AppointmentServiceTest {	

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
		
	@Test
	@Order(2)
	void test_AppointmentService_Finder_Valid() {
		Appointment appointment = AppointmentService.findAppointment("7");
		
		assertEquals(appointment.getAppointmentID(), "7");
		assertEquals(appointment.getDate(), new Date(157, 10, 10, 10, 10, 10));
		assertEquals(appointment.getDescription(), "SEVEN");
		
		appointment = AppointmentService.findAppointment("2");
		
		assertEquals(appointment.getAppointmentID(), "2");
		assertEquals(appointment.getDate(), new Date(152, 10, 10, 10, 10, 10));
		assertEquals(appointment.getDescription(), "TWO");
	}
		
	@Test
	@Order(3)
	void test_AppointmentService_Remover_Valid() {
		AppointmentService.removeAppointment("1");
		Appointment appointment = AppointmentService.findAppointment("1");
		
		assertEquals(appointment, null);
	}
	
	@Test
	@Order(4)
	void test_AppointmentService_Constructor_Invalid() {
		AppointmentService.addAppointment(new Date(1, 10, 10, 10, 10, 10), 		"ONE");
		AppointmentService.addAppointment(new Date(151, 10, 10, 10, 10, 10), 	"000000000000000000000000000000000000000000000000000");
	}
	
	@Test
	@Order(5)
	void test_AppointmentService_Finder_Invalid() {
		Appointment appointment = AppointmentService.findAppointment("-1");
		
		assertEquals(appointment, null);
	}
		
	@Test
	@Order(6)
	void test_AppointmentService_Remover_Invalid() {
		AppointmentService.removeAppointment("-1");
		Appointment appointment = AppointmentService.findAppointment("-1");
		
		assertEquals(appointment, null);
	}
}