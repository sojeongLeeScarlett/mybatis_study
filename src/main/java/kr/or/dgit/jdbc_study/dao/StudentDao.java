package kr.or.dgit.jdbc_study.dao;

import java.util.List;


import kr.or.dgit.mybatis_study.Student;

public interface StudentDao {
	Student frindStudentById(int studid);
	void insertStudent(Student student);
	void deleteStudent(int studid);
	List<Student> findAllStudents();
}
