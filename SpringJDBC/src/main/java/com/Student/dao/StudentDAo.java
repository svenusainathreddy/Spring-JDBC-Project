package com.Student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Student.model.Student;

public class StudentDAo {
	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Student s) {
		String sql = "insert into studentexample values(" + s.getSid() + ",'" + s.getFirstname() + "','"
				+ s.getLastname() + "'," + s.getAge() + "," + s.getPhone() + ",'" + s.getEmailid() + "',"
				+ s.getPassedout() + ")";
		return template.update(sql);
	}

	public int update(Student s) {
		String sql = "update studentexample set firstname='" + s.getFirstname() + "', lastname='" + s.getLastname()
				+ "', " + "age=" + s.getAge() + ", phone=" + s.getPhone() + ", emailid='" + s.getEmailid()
				+ "', passedout=" + s.getPassedout() + " where sid=" + s.getSid();
		return template.update(sql);
	}

	public int delete(int sid) {
		String sql = "delete from studentexample where sid = " + sid;
		return template.update(sql);
	}

	public List<Student> getStudents() {
		String sql = "select * from studentexample;";
		return template.query(sql, new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setSid(rs.getInt(1));
				s.setFirstname(rs.getString(2));
				s.setLastname(rs.getString(3));
				s.setAge(rs.getInt(4));
				s.setPhone(rs.getLong(5));
				s.setEmailid(rs.getString(6));
				s.setPassedout(rs.getInt(7));
				return s;
			}
		});
	}

	public Student getStudentById(int id) {
		String sql = "select * from studentexample where sid=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Student>(Student.class));
	}
}
