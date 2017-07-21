package service;

import java.util.List;

import entity.Student;

public interface StudentService {
	   public List<Student> getAll();
	    
	    public  List<Student> getByName(Student student);
	    
	    public int add(Student student);
	    
	    public int update(Student student);
	    public int delete(Student student);
	    public Student getById(Student student);
}
