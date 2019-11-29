package net.dfrz.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import net.dfrz.entity.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		Student student= new Student();
		student.setStuID(rs.getString("StuID"));
		student.setName(rs.getString("name"));
		student.setBirthday(rs.getDate("birthday"));
		student.setMobile(rs.getString("mobile"));
		student.setAddr(rs.getString("addr"));
		return student;
	}


}
