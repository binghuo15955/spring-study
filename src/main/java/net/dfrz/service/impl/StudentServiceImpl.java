package net.dfrz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.dfrz.dao.StudentDAOI;
import net.dfrz.entity.Student;
import net.dfrz.service.StudentServiceI;

@Service("studentService")
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired
	private StudentDAOI studentDAO;
	
	/* (non-Javadoc)
	 * @see net.dfrz.service.impl.StudentServiceI#addStudent(net.dfrz.entity.Student)
	 */
	@Override
	public int addStudent(Student student) {
		System.out.println("service-->add(stuDAO)");
		return studentDAO.addStudent(student);
	}
	
	/* (non-Javadoc)
	 * @see net.dfrz.service.impl.StudentServiceI#updStudent(net.dfrz.entity.Student)
	 */
	@Override
	public int updStudent(Student student) {
		System.out.println("service-->update(stuDAO)");
		return studentDAO.addStudent(student);
	}
	
	/* (non-Javadoc)
	 * @see net.dfrz.service.impl.StudentServiceI#delStudent(net.dfrz.entity.Student)
	 */
	@Override
	public int delStudent(Student stuID) {
		System.out.println("service-->del(stuDAO)");
		return studentDAO.addStudent(stuID);
	}
	
	/* (non-Javadoc)
	 * @see net.dfrz.service.impl.StudentServiceI#getStudentByStuId(java.lang.String)
	 */
	@Override
	public Student getStudentByStuId(String stuID) {
		System.out.println("service-->get(stuDAO)");
		return studentDAO.getStudentByStuId(stuID);
	}

	@Override
	public List<Student> getStudents() {
		System.out.println("service-->getAll(stuDAO)");
		return studentDAO.getStudents();
	}
}
