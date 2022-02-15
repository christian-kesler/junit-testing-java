//============================================================================
// Project Name: Contact Service 
// Author      : Christian Kesler
// Version     : 1.1
// Description : Java classes and JUnit tests to verify functionality 
//============================================================================
package contact.services.test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import contact.services.Task;
import contact.services.TaskService;

//perform the tests in the specified order
@TestMethodOrder(OrderAnnotation.class)

//The Task Service Test class
public class TaskServiceTest {	

	// Test Task Service constructor with valid input and create default entries for future tests
	@Test
	@Order(1)
	void test_TaskService_Constructor_Valid() {
		TaskService.addTask("one", 	"ONE");
		TaskService.addTask("two", 	"TWO");
		TaskService.addTask("three","THREE");
		TaskService.addTask("four", "FOUR");
		TaskService.addTask("five", "FIVE");
		TaskService.addTask("six", 	"SIX");
		TaskService.addTask("seven","SEVEN");
		TaskService.addTask("eight","EIGHT");
		TaskService.addTask("nine", "NINE");
	}
	
	// Test Task Service constructor with invalid input	
	@Test
	@Order(2)
	void test_TaskService_Constructor_Invalid() {
		// Invalid name
		TaskService.addTask("oneoneoneone", 	"ONE");
		// Invalid description
		TaskService.addTask("two", 				"twotwotwotwotwotwotwo");
	}

	// Test Task Service finder with valid query		
	@Test
	@Order(3)
	void test_TaskService_Finder_Valid() {
		Task task = TaskService.findTask("7");
		
		assertEquals(task.getTaskId(), "7");
		assertEquals(task.getName(), "seven");
		assertEquals(task.getDescription(), "SEVEN");
		
		task = TaskService.findTask("2");
		
		assertEquals(task.getTaskId(), "2");
		assertEquals(task.getName(), "two");
		assertEquals(task.getDescription(), "TWO");
	}
	
	// Test Task Service finder with invalid query
	@Test
	@Order(4)
	void test_TaskService_Finder_Invalid() {
		Task task = TaskService.findTask("-1");
		
		assertEquals(task, null);
	}

	// Test Task Service remover with valid query
	@Test
	@Order(5)
	void test_TaskService_Remover_Valid() {
		TaskService.removeTask("1");
		Task task = TaskService.findTask("1");
		
		assertEquals(task, null);
	}
	
	// Test Task Service remover with invalid query
	@Test
	@Order(6)
	void test_TaskService_Remover_Invalid() {
		TaskService.removeTask("-1");
		Task task = TaskService.findTask("-1");
		
		assertEquals(task, null);
	}
	
	
	// Test Task Service setter with valid name
	@Test
	@Order(7)
	void test_TaskService_Setter_ValidName() {
		Task task = TaskService.findTask("5");
		assertEquals(task.getTaskId(), "5");
		assertEquals(task.getName(), "five");
		TaskService.setTaskName("5", "Five");
		task = TaskService.findTask("5");
		assertEquals(task.getTaskId(), "5");
		assertEquals(task.getName(), "Five");
	}
	
	// Test Task Service setter with valid description
	@Test
	@Order(8)
	void test_TaskService_Setter_ValidDescription() {
		Task task = TaskService.findTask("2");
		assertEquals(task.getTaskId(), "2");
		assertEquals(task.getDescription(), "TWO");
		TaskService.setTaskDescription("2", "tWO");
		task = TaskService.findTask("2");
		assertEquals(task.getTaskId(), "2");
		assertEquals(task.getDescription(), "tWO");
	}
	
	// Test Task Service setter with invalid name
	@Test
	@Order(9)
	void test_TaskService_Setter_InvalidName() {
		Task task = TaskService.findTask("5");
		assertEquals(task.getTaskId(), "5");
		assertEquals(task.getName(), "Five");
		TaskService.setTaskName("5", "fivefivefivefivefivefivefivefivefivefive");
		task = TaskService.findTask("5");
		assertEquals(task.getTaskId(), "5");
		assertEquals(task.getName(), "Five");
	}
	
	// Test Task Service setter with invalid description
	@Test
	@Order(10)
	void test_TaskService_Setter_InvalidDescription() {
		Task task = TaskService.findTask("2");
		assertEquals(task.getTaskId(), "2");
		assertEquals(task.getDescription(), "tWO");
		TaskService.setTaskDescription("2", "twotwotwotwotwotwotwotwotwotwotwotwo");
		task = TaskService.findTask("2");
		assertEquals(task.getTaskId(), "2");
		assertEquals(task.getDescription(), "tWO");
	}
}