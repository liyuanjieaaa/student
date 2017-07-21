package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Student;

import service.StudentService;

@Controller
public class StudentController {

	@Autowired
	public StudentService ss;
	
	@RequestMapping("/getAll")
	public String getAll(Model model){
		List<Student> list=ss.getAll();
		model.addAttribute("list", list);
		return "main";
	}
	
	@RequestMapping("/getByName")
	public String getByName(Student student, Model model){
		if (student.getName()==null||student.getName().equals("")) {
			return "redirect:/getAll";
		}
		List<Student> list=ss.getByName(student);
		model.addAttribute("list", list);
		return "main";
	}
	@RequestMapping("/toadd")
	public String add(){
		return "add";
		
		
	}
	@RequestMapping("/doadd")
	public String add(Student student){
		ss.add(student);
		
		return "redirect:/getAll";
		
		
	}
	
	@RequestMapping("/getById")
	public String getById(Student student,Model model ){
		System.out.println(student.toString());
		Student s1=ss.getById(student);
		model.addAttribute("s1",s1);
		return "update";
		
	}
	@RequestMapping("/update")
	public String getById(Student student){
		ss.update(student);
		
		return "redirect:/getAll";
		
		
	}
	
	
	@RequestMapping("/delete")
	public String delete(Student  student){
		ss.delete(student);
		
		return "redirect:/getAll";
		
	}
}
