//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services;
import java.util.Date;
import java.util.Vector;

// the Appointment Service class
public class AppointmentService {
	public static int intId = 1;
	
	// New Vector AppointmentList is created to store Appointments
	static Vector<Appointment> AppointmentList = new Vector<Appointment>(0);

	// Add Appointment method to Appointment Service  
	public static void addAppointment(Date date, String description) {
		Appointment appointment = new Appointment(Integer.toString(intId), date, description);
		AppointmentList.add(appointment);
		++intId;
	}
	
	// Remove Appointment method from Appointment Service 
	public static void removeAppointment(String appointmentId) {
		for (int i = 0; i < AppointmentList.size(); ++i) {
			if (AppointmentList.get(i).getAppointmentId() != null) {
				if (AppointmentList.get(i).getAppointmentId().equals(appointmentId)) {
					AppointmentList.remove(i);
				}
			}
		}
	}
	
	// Find Appointment method in Appointment Service 
	public static Appointment findAppointment(String appointmentId) {
		Appointment appointment = null;
		for (int i = 0; i < AppointmentList.size(); ++i) {
			if (AppointmentList.get(i).getAppointmentId() != null) {
				if (AppointmentList.get(i).getAppointmentId().equals(appointmentId)) {
					appointment = AppointmentList.get(i);
				}
			}
		}
		return appointment;
	}
}