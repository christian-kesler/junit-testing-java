//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services;
import java.util.Vector;

// The Task Service class
public class TaskService {
	public static int intId = 1;

	// New Vector TaskList is created to store Tasks
	static Vector<Task> TaskList = new Vector<Task>(0);

	// Add Task method to Task Service  
	public static void addTask(String name, String description) {
		Task task = new Task(Integer.toString(intId), name, description);
		TaskList.add(task);
		++intId;
	}
		
	// Remove Task method from Task Service  
	public static void removeTask(String taskId) {
		for (int i = 0; i < TaskList.size(); ++i) {
			if (TaskList.get(i).getTaskId() != null) {
				if (TaskList.get(i).getTaskId().equals(taskId)) {
					TaskList.remove(i);
				}
			}
		}
	}
	
	// Find Task method in Task Service  
	public static Task findTask(String taskId) {
		Task task = null;
		for (int i = 0; i < TaskList.size(); ++i) {
			if (TaskList.get(i).getTaskId() != null) {
				if (TaskList.get(i).getTaskId().equals(taskId)) {
					task = TaskList.get(i);
				}
			}
		}
		return task;
	}
	
	// Set Task Name method in Task Service
	public static void setTaskName(String taskId, String input) {
		for (int i = 0; i < TaskList.size(); ++i) {
			if (TaskList.get(i).getTaskId() != null) {
				if (TaskList.get(i).getTaskId().equals(taskId)) {
					Task.setName(TaskList.get(i), input);
				}
			}
		}
	}

	// Set Task Description method in Task Service
	public static void setTaskDescription(String taskId, String input) {
		for (int i = 0; i < TaskList.size(); ++i) {
			if (TaskList.get(i).getTaskId() != null) {
				if (TaskList.get(i).getTaskId().equals(taskId)) {
					Task.setDescription(TaskList.get(i), input);
				}
			}
		}
	}
}