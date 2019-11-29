package net.dfrz.test.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.dfrz.entity.Student;
import net.dfrz.service.StudentServiceI;
import net.dfrz.test.TestCase;


public class TestStudentService extends TestCase{
	
	@Autowired
	private StudentServiceI studentService;
	
	@Test
	public void testAddstudent() {
		Student s=new Student(UUID.randomUUID().toString().replaceAll("-", ""), "王五",new Date(), "134631253472", "厦门大学");
		studentService.addStudent(s);
	}
	
	@Test
	public void testGetstudent() {
		Student student=studentService.getStudentByStuId("47d5ee61d7c448f59c0aa8179f9f047e");
		System.out.println(student.getName());
	}
	
	@Test
	public void testGetstudents() {
		List<Student> students=studentService.getStudents();
		System.out.println(students.size());
	}
}
