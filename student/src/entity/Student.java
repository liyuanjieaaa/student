package entity;

public class Student {
private int id;
private String name;
private int age;
private int nianji;

public Student() {
	super();
}
public Student(Integer id, String name, Integer age, int nianji) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.nianji = nianji;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public int getNianji() {
	return nianji;
}
public void setNianji(int nianji) {
	this.nianji = nianji;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age
			+ ", nianji=" + nianji + "]";
}


}
