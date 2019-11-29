 package net.dfrz.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.dfrz.dao.StudentDAOI;
import net.dfrz.entity.Student;
import net.dfrz.entity.mapper.StudentMapper;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAOI {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public int addStudent(Student student) {
//		String sql="insert into student values('"+UUID.randomUUID().toString().replaceAll("-", "")+"','张三','2000/01/01','10193948582','福师大')";
//		jdbctemplate.update(sql);
		String sql="insert into student values(?,?,?,?,?);";
		jdbctemplate.update(sql, new Object[] {student.getStuID(),student.getName(),student.getBirthday(),student.getMobile(),student.getAddr()});
		System.out.println("stuDAO-->add");
		return 0;
	}

	@Override
	public int updStudent(Student student) {
		System.out.println("stuDAO-->update");
		return 0;
	}

	@Override
	public int delStudent(String stuID) {
		System.out.println("stuDAO-->delete");
		return 0;
	}

	@Override
	public Student getStudentByStuId(String stuID) {
		String sql="select * from student where stuID=?";
		Student student=jdbctemplate.queryForObject(sql, new Object[] {stuID}, new StudentMapper());
		System.out.println("stuDAO-->get");
		return student;
	}

	@Override
	public List<Student> getStudents() {
		String sql="select * from student";
		List<Student> students=jdbctemplate.query(sql, new StudentMapper());
		System.out.println("stuDAO-->getAll");
		return students;
	}	

}
