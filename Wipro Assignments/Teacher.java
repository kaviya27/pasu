package Inheritance;

public class Teacher extends Person {
	double salary;
	String sub;
	public Teacher(String name, int age,double salary,String sub) {
		super(name, age);
		this.salary=salary;
		this.sub=sub;
		System.out.println("Teacher : "+name+"\t"+age+"\t"+salary+"\t"+sub);
	}
}
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
class CollegeStudent extends Student{
	int year;
	String dept;
	public CollegeStudent(String name, int age,int year,String dept) {
		super(name, age);
		this.dept=dept;
		this.year=year;
		System.out.println("Student : "+name+"\t"+age+"\t"+dept+"\t"+year);
	}
}
class Test{
	public static void main(String[] args) {
		Teacher t=new Teacher("Shankar", 44, 40000, "English");
		CollegeStudent c=new CollegeStudent("Pasu",20,4,"CSE"); 
	}
}