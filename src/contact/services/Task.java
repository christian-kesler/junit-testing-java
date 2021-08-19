package contact.services;
//Christian Kesler

public class Task {
	private String taskID;
	private String name;
	private String description;

	public Task(String taskID, String name, String description) {
		if(taskID == null || taskID.length()>10) {
			System.out.print("Invalid task id. \n");
	    } else if(name == null || name.length()>20) {
	    	System.out.print("Invalid name. \n");
	    } else if(description == null || description.length()>30) {
	    	System.out.print("Invalid description. \n");
	    } else {
		    this.taskID = taskID;
		    this.name = name;
		    this.description = description;
	    }
	}

	public String getTaskID() {
		return taskID;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	
	public static void setName(Task task, String input) {
		if(input == null || input.length()>20) {
	    	System.out.print("Invalid name. \n");
	    } else {
	    	task.name = input;		
	    }
	}
	
	public static void setDescription(Task task, String input) {
		if(input == null || input.length()>30) {
	    	System.out.print("Invalid description. \n");
	    } else {
	    	task.description = input;
	    }
	}
}