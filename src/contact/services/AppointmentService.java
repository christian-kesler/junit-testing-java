package contact.services;
//Christian Kesler

import java.util.Date;
import java.util.Vector;

public class AppointmentService {
	public static int intID = 1;
	
	static Vector<Appointment> AppointmentList = new Vector<Appointment>(0);

	public static void addAppointment(Date date, String description) {
		Appointment appointment = new Appointment(Integer.toString(intID), date, description);
		AppointmentList.add(appointment);
		++intID;
	}
	
	public static void removeAppointment(String appointmentID) {
		for (int i = 0; i < AppointmentList.size(); ++i) {
			if (AppointmentList.get(i).getAppointmentID() != null) {
				if (AppointmentList.get(i).getAppointmentID().equals(appointmentID)) {
					AppointmentList.remove(i);
				}
			}
		}
	}
	public static Appointment findAppointment(String appointmentID) {
		Appointment appointment = null;
		for (int i = 0; i < AppointmentList.size(); ++i) {
//			System.out.print("The size of the array: " + AppointmentList.size() + "\n");
//			System.out.print("The ID we are looking for: " + appointmentID + "\n");
//			System.out.print("The ID the loop has found: " + AppointmentList.get(i).getAppointmentID() + "\n");
			if (AppointmentList.get(i).getAppointmentID() != null) {
				if (AppointmentList.get(i).getAppointmentID().equals(appointmentID)) {
//					System.out.print("The appointment the loop likes: " + AppointmentList.get(i) + "\n");
					appointment = AppointmentList.get(i);
//					System.out.print("The appointment the loop assigned: " + appointment + "\n");
				}
			}
		}
		return appointment;
	}
}