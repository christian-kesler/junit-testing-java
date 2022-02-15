//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services;

// The Task class
public class Task {
	
	// class attributes
	private String taskId;
	private String name;
	private String description;
	
	// variables used to verify the constructor input
	private static int taskIdMaxLength = 10;
	private static int taskNameMaxLength = 20;
	private static int taskDescriptionMaxLength = 30;

	// The Task constructor
	public Task(String taskId, String name, String description) {
		
		// verifying input validity and creating object
		if(verifyId(taskId) && verifyName(name) && verifyDescription(description)) {
		    this.taskId = taskId;
		    this.name = name;
		    this.description = description;
	    }
	}
	
	// Task Id verifier
	public static boolean verifyId(String input) {
		if(input == null || input.length()>taskIdMaxLength) {
			System.out.print("Invalid Task Id, must be " + taskIdMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}
		
	// Task Name verifier
	public static boolean verifyName(String input) {
		if(input == null || input.length()>taskNameMaxLength) {
	    	System.out.print("Invalid Name, must be " + taskNameMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}

	// Task Description verifier
	public static boolean verifyDescription(String input) {
		if(input == null || input.length()>taskDescriptionMaxLength) {
	    	System.out.print("Invalid Description, must be " + taskDescriptionMaxLength + " characters or less. \n");
	    	return false;
		} else {
    	return true;
		}
	}
	
	// Task Id getter
	public String getTaskId() {
		return taskId;
	}

	// Task Name getter
	public String getName() {
		return name;
	}
	
	// Task Description getter
	public String getDescription() {
		return description;
	}
	
	// Task Id setter
	public static void setId(Task task, String input) {
		if(verifyId(input)) {
	    	task.taskId = input;		
		}
	}
		
	// Task Name setter
	public static void setName(Task task, String input) {
		if(verifyName(input)) {
	    	task.name = input;		
		}
	}
	
	// Task Description setter
	public static void setDescription(Task task, String input) {
		if(verifyDescription(input)) {
	    	task.description = input;
	    }
	}
}