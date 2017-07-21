package mapper;

import java.util.List;

import entity.Student;



public interface StudentMapper {
	
	  public Student getById(Student student);
    
    public List<Student> getAll();
    
    public  List<Student> getByName(Student student);
    
    public int add(Student student);
    
    public int update(Student student);
    public int delete(Student student);
}
