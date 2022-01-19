//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services.test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import contact.services.Task;

// The Task Test class
class TaskTest {
	
	// variables that serve as input for tests
	private String validId = "123456789";
	private String validName = "David";
	private String validDescription = "Enjoying the Sunset";
	
	private String invalidId = "111222333444555";
	private String invalidName = "Siegfriedeumondenhower";
	private String invalidDescription = "an appointment for extreme lower abdominal pain that originates from a stilted gait";
	
	private String validNameTemp = "Cowabunga";
	private String validDescriptionTemp = "A Great Time with Friends";

	// Test Task constructor with all valid input
	@Test
	void test_Task_Constructor_Valid() {
		Task task = new Task(validId, validName, validDescription);
		assertEquals(task.getTaskId(), validId);
		assertEquals(task.getName(), validName);
		assertEquals(task.getDescription(), validDescription);
	}
	
	// Test Task constructor with invalid Id
	@Test
	void test_Task_Constructor_InvalidId() {
		Task task = new Task(invalidId, validName, validDescription);
		assertEquals(task.getTaskId(), null);
		assertEquals(task.getName(), null);
		assertEquals(task.getDescription(), null);
	}
	
	// Test Task constructor with invalid name
	@Test
	void test_Task_Constructor_InvalidName() {
		Task task = new Task(validId, invalidName, validDescription);
		assertEquals(task.getTaskId(), null);
		assertEquals(task.getName(), null);
		assertEquals(task.getDescription(), null);
	}
	
	// Test Task constructor with invalid description
	@Test
	void test_Task_Constructor_InvalidDescription() {
		Task task = new Task(validId, validName, invalidDescription);
		assertEquals(task.getTaskId(), null);
		assertEquals(task.getName(), null);
		assertEquals(task.getDescription(), null);
	}
	
	// Test Task setters with all valid input
	@Test
	void test_Task_Setters_Valid() {
		Task task = new Task(validId, validNameTemp, validDescriptionTemp);
		assertEquals(task.getTaskId(), validId);
		Task.setName(task, validName);
		assertEquals(task.getName(), validName);
		Task.setDescription(task, validDescription);
		assertEquals(task.getDescription(), validDescription);
	}
	
	// Test Task setters with all invalid input
	@Test
	void test_Task_Setters_Invalid() {
		Task task = new Task(validId, validNameTemp, validDescriptionTemp);
		assertEquals(task.getTaskId(), validId);
		Task.setName(task, invalidName);
		assertEquals(task.getName(), validNameTemp);
		Task.setDescription(task, invalidDescription);
		assertEquals(task.getDescription(), validDescriptionTemp);
	}
}
