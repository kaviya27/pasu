package Inheritance;

public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person{
	double salary;
	public Employee(String name, int age,double salary) {
		super(name, age);
		this.salary=salary;
		System.out.println("Name: "+name+"\n age: "+age+"\n Salary: "+salary);
	}
}
class TestEmployee{
	public static void main(String[] args) {
		Employee e=new Employee("Pasupathi.M", 20,100000 );
	}
}