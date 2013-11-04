package com.ait.com.restfull.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ait.com.restfull.dto.ResultDto;
import com.ait.com.restfull.dto.StudentDto;
import com.ait.com.restfull.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

	@Override
	public ResultDto getStudentPage(int page, int limit) {
		ResultDto result = new ResultDto();

		List<StudentDto> students = new ArrayList<StudentDto>();
		StudentDto s1 = new StudentDto();
		s1.setId(1l);
		s1.setName("leiwuluan");
		s1.setAddress("成都大学");
		s1.setAge(22);
		s1.setScroe(100l);
		students.add(s1);

		s1 = new StudentDto();
		s1.setId(1l);
		s1.setName("leiwuluan");
		s1.setAddress("成都大学我");
		s1.setAge(22);
		s1.setScroe(100l);
		students.add(s1);

		s1 = new StudentDto();
		s1.setId(1l);
		s1.setName("leiwuluan");
		s1.setAddress("成都大学3");
		s1.setAge(22);
		s1.setScroe(100l);
		students.add(s1);

		s1 = new StudentDto();
		s1.setId(1l);
		s1.setName("leiwuluan");
		s1.setAddress("成都大学4");
		s1.setAge(22);
		s1.setScroe(100l);
		students.add(s1);

		s1 = new StudentDto();
		s1.setId(1l);
		s1.setName("leiwuluan");
		s1.setAddress("成都大学5");
		s1.setAge(22);
		s1.setScroe(100l);
		students.add(s1);

		s1 = new StudentDto();
		s1.setId(1l);
		s1.setName("leiwuluan");
		s1.setAddress("成都大学6");
		s1.setAge(22);
		s1.setScroe(100l);
		students.add(s1);

		result.students = students;
		result.totalCount = 100;
		result.totalPage = 12;
		result.returncode = "success";
		return result;
	}

	@Override
	//@Produces("application/xml")
	public ResultDto getStudentById(long id) {
		ResultDto result = new ResultDto();
		List<StudentDto> students = new ArrayList<StudentDto>();
		StudentDto s1 = new StudentDto();
		s1.setId(1l);
		s1.setName("leiwuluan");
		s1.setAddress("成都大学1");
		s1.setAge(22);
		s1.setScroe(100l);
		students.add(s1);

		result.students = students;
		result.returncode = "success";
		return result;
	}

	@Override
	public ResultDto deleteDeleteStudentById(long id) {
		ResultDto result = new ResultDto();
		result.returncode = "success";
		return result;
	}

	@Override
	public ResultDto addStudent(StudentDto student) {
		ResultDto result = new ResultDto();
		System.out.println("Address:" + student.getAddress() + ",Name:"
				+ student.getName() + ",ID:" + student.getId());
		result.returncode = "success";
		return result;
	}

}
