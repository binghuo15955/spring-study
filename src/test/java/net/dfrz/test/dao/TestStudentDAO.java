package net.dfrz.test.dao;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import net.dfrz.dao.StudentDAOI;
import net.dfrz.entity.Student;
import net.dfrz.test.TestCase;

public class TestStudentDAO extends TestCase{

	@Autowired
	private StudentDAOI studentDAO;
	
	@Test
	public void testAddStudent() {
		Student s=new Student(UUID.randomUUID().toString().replaceAll("-", ""), "����",new Date(), "13463465472", "���ݴ�ѧ");
		studentDAO.addStudent(s);
	}
}
