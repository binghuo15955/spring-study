package net.dfrz.dao;

import java.util.List;

import net.dfrz.entity.Student;

public interface StudentDAOI {
	int addStudent(Student student);
	int updStudent(Student student);
	int delStudent(String stuID);
	Student getStudentByStuId(String stuID);
	List<Student> getStudents();
}
