package contact.services;
//Christian Kesler

import java.util.Vector;

public class TaskService {
	public static int intID = 1;
		
	static Vector<Task> TaskList = new Vector<Task>(0);

	public static void addTask(String name, String description) {
		Task task = new Task(Integer.toString(intID), name, description);
		TaskList.add(task);
		++intID;
	}
		
	public static void removeTask(String taskID) {
		for (int i = 0; i < TaskList.size(); ++i) {
			if (TaskList.get(i).getTaskID() != null) {
				if (TaskList.get(i).getTaskID().equals(taskID)) {
					TaskList.remove(i);
				}
			}
		}
	}
	public static Task findTask(String taskID) {
		Task task = null;
		for (int i = 0; i < TaskList.size(); ++i) {
//				System.out.print("The size of the array: " + TaskList.size() + "\n");
//				System.out.print("The ID we are looking for: " + taskID + "\n");
//				System.out.print("The ID the loop has found: " + TaskList.get(i).getTaskID() + "\n");
			if (TaskList.get(i).getTaskID() != null) {
				if (TaskList.get(i).getTaskID().equals(taskID)) {
//						System.out.print("The task the loop likes: " + TaskList.get(i) + "\n");
					task = TaskList.get(i);
//						System.out.print("The task the loop assigned: " + task + "\n");
				}
			}
		}
		return task;
	}
	
	public static void setTaskName(String taskID, String input) {
		for (int i = 0; i < TaskList.size(); ++i) {
			if (TaskList.get(i).getTaskID() != null) {
				if (TaskList.get(i).getTaskID().equals(taskID)) {
					Task.setName(TaskList.get(i), input);
				}
			}
		}
	}
	
	public static void setTaskDescription(String taskID, String input) {
		for (int i = 0; i < TaskList.size(); ++i) {
			if (TaskList.get(i).getTaskID() != null) {
				if (TaskList.get(i).getTaskID().equals(taskID)) {
					Task.setDescription(TaskList.get(i), input);
				}
			}
		}
	}
}