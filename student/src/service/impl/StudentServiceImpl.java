package service.impl;

import java.util.List;

import mapper.StudentMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Student;
import service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper mapper;	
	
	@Override
	public List<Student> getAll() {
		List<Student>list=mapper.getAll();
		return list;
	}

	@Override
	public List<Student> getByName(Student student) {
		List<Student>list=mapper.getByName(student);
		return list;
	}

	@Override
	public int add(Student student) {
		
		int ii=mapper.add(student);
		return ii;
	}

	@Override
	public int update(Student student) {
		
		int ii=mapper.update(student);
		return ii;
	}

	@Override
	public int delete(Student student) {
		int ii=mapper.delete(student);
		return ii;
	}

	@Override
	public Student getById(Student student) {
		
		return mapper.getById(student);
	}

}
