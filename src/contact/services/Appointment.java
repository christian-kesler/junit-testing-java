package contact.services;
import java.util.Date;

public class Appointment {
	private String appointmentID;
	private Date date;
	private String description;
	
	public Appointment(String appointmentID, Date date, String description) {
		if(appointmentID == null || appointmentID.length()>10) {
			System.out.print("Invalid appointment id. \n");
		} else if(date == null || date.before(new Date())) {
			System.out.print("Invalid date. \n");
//			System.out.print(new Date() + "\n");
//			System.out.print(date);
		} else if(description == null || description.length()>50) {
			System.out.print("Invalid description. \n");
		} else {
			this.appointmentID = appointmentID;
			this.date = date;
			this.description = description;
		}
	}

	public String getAppointmentID() {
		return appointmentID;
	}

	public Date getDate() {
		return date;
	}
		
	public String getDescription() {
		return description;
	}		
}
