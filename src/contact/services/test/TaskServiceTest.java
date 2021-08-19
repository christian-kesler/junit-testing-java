package contact.services.test;
//Christian Kesler

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import contact.services.Task;
import contact.services.TaskService;

@TestMethodOrder(OrderAnnotation.class)
public class TaskServiceTest {	

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
		
	@Test
	@Order(2)
	void test_TaskService_Finder_Valid() {
		Task task = TaskService.findTask("7");
		
		assertEquals(task.getTaskID(), "7");
		assertEquals(task.getName(), "seven");
		assertEquals(task.getDescription(), "SEVEN");
		
		task = TaskService.findTask("2");
		
		assertEquals(task.getTaskID(), "2");
		assertEquals(task.getName(), "two");
		assertEquals(task.getDescription(), "TWO");
	}
		
	@Test
	@Order(3)
	void test_TaskService_Remover_Valid() {
		TaskService.removeTask("1");
		Task task = TaskService.findTask("1");
		
		assertEquals(task, null);
	}
	
	@Test
	@Order(4)
	void test_TaskService_Constructor_Invalid() {
		TaskService.addTask("oneoneoneone", 	"ONE");
		TaskService.addTask("two", 				"twotwotwotwotwotwotwo");
	}
	
	@Test
	@Order(5)
	void test_TaskService_Finder_Invalid() {
		Task task = TaskService.findTask("-1");
		
		assertEquals(task, null);
	}
		
	@Test
	@Order(6)
	void test_TaskService_Remover_Invalid() {
		TaskService.removeTask("-1");
		Task task = TaskService.findTask("-1");
		
		assertEquals(task, null);
	}
	
	@Test
	@Order(7)
	void test_TaskService_Setter_ValidName() {
		Task task = TaskService.findTask("5");
		assertEquals(task.getTaskID(), "5");
		assertEquals(task.getName(), "five");
		TaskService.setTaskName("5", "Five");
		task = TaskService.findTask("5");
		assertEquals(task.getTaskID(), "5");
		assertEquals(task.getName(), "Five");
	}
	
	@Test
	@Order(8)
	void test_TaskService_Setter_ValidDescription() {
		Task task = TaskService.findTask("2");
		assertEquals(task.getTaskID(), "2");
		assertEquals(task.getDescription(), "TWO");
		TaskService.setTaskDescription("2", "tWO");
		task = TaskService.findTask("2");
		assertEquals(task.getTaskID(), "2");
		assertEquals(task.getDescription(), "tWO");
	}
	
	@Test
	@Order(9)
	void test_TaskService_Setter_InvalidName() {
		Task task = TaskService.findTask("5");
		assertEquals(task.getTaskID(), "5");
		assertEquals(task.getName(), "Five");
		TaskService.setTaskName("5", "fivefivefivefivefivefivefivefivefivefive");
		task = TaskService.findTask("5");
		assertEquals(task.getTaskID(), "5");
		assertEquals(task.getName(), "Five");
	}
	
	@Test
	@Order(10)
	void test_TaskService_Setter_InvalidDescription() {
		Task task = TaskService.findTask("2");
		assertEquals(task.getTaskID(), "2");
		assertEquals(task.getDescription(), "tWO");
		TaskService.setTaskDescription("2", "twotwotwotwotwotwotwotwotwotwotwotwo");
		task = TaskService.findTask("2");
		assertEquals(task.getTaskID(), "2");
		assertEquals(task.getDescription(), "tWO");
	}
}