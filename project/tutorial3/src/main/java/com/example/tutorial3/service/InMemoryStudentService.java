package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();

	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel student=null;
		for(StudentModel a: studentList) {
			if(a.getNPM().equalsIgnoreCase(npm))
				student=a;
		}
		return student;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}

	@Override
	public StudentModel deleteStudent(String npm) {
		StudentModel student = student = selectStudent(npm);
		if(student !=null)
			studentList.remove(student);
		return student;
	}
	
}
