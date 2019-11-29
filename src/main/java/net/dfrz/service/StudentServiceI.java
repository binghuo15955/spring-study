package net.dfrz.service;

import java.util.List;

import net.dfrz.entity.Student;

public interface StudentServiceI {

	int addStudent(Student student);

	int updStudent(Student student);

	int delStudent(Student stuID);

	Student getStudentByStuId(String stuID);
	
	List<Student> getStudents();


}