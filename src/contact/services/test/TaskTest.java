package contact.services.test;
//Christian Kesler

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import contact.services.Task;

class TaskTest {

	@Test
	void test_Task_Constructor_Valid() {
		Task task = new Task("Java 101", "12345", "3");
		assertEquals(task.getTaskID(), "Java 101");
		assertEquals(task.getName(), "12345");
		assertEquals(task.getDescription(), "3");
	}
	
	@Test
	void test_Task_Setters_Valid() {
		Task task = new Task("Java 101", "12345", "3");
		assertEquals(task.getTaskID(), "Java 101");
		Task.setName(task, "judy");
		assertEquals(task.getName(), "judy");
		Task.setDescription(task, "baggins");
		assertEquals(task.getDescription(), "baggins");
	}
	
	@Test
	void test_Task_Constructor_InvalidID() {
		Task task = new Task("Java 1011234512345123451234512345", "12345", "3");
		assertEquals(task.getTaskID(), null);
		assertEquals(task.getName(), null);
		assertEquals(task.getDescription(), null);
	}
	
	@Test
	void test_Task_Constructor_InvalidName() {
		Task task = new Task("Java 101", "1234512345123451234512345", "3");
		assertEquals(task.getTaskID(), null);
		assertEquals(task.getName(), null);
		assertEquals(task.getDescription(), null);
	}
	
	@Test
	void test_Task_Constructor_InvalidDescription() {
		Task task = new Task("Java 101", "12345", "312345123451234512345123451234512345");
		assertEquals(task.getTaskID(), null);
		assertEquals(task.getName(), null);
		assertEquals(task.getDescription(), null);
	}
	
	@Test
	void test_Task_Setters_Invalid() {
		Task task = new Task("Java 101", "12345", "3");
		assertEquals(task.getTaskID(), "Java 101");
		Task.setName(task, "judy1234512345123451234512345");
		assertEquals(task.getName(), "12345");
		Task.setDescription(task, "baggins12345123451234512345123451234512345123451234512345");
		assertEquals(task.getDescription(), "3");
	}
}
