import java.util.Scanner;

class Employee{
	static int empno;
	String name,dept,designation;;
	char designationcode;
	int Basic,HRA,DA,IT;
	float salary;
	public void salary(int empno,String name,String dept,char designationcode,int Basic,int HRA,int IT) {
		if(designationcode=='e') {
			DA=20000;
			designation="Engineer ";}
		else if(designationcode=='c') {
			DA=32000;
			designation="Consultant";}
		else if(designationcode=='k') {
			DA=12000;
			designation="Clerk ";}
		else if(designationcode=='r') {
			DA=15000;
			designation="Receptionist";}
		else if(designationcode=='m') {
			DA=40000;
			designation="Manager ";}
		salary=Basic+HRA+DA-IT;
		System.out.println("EmpNo\tEmp Name\t Department \tDesignation \tSalary");
		System.out.println(empno+"\t"+name+"\t\t"+dept+"\t\t"+designation+"\t"+salary);
	}

    public static void main(String[] args) {
		Employee e=new Employee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the employee id : ");
		empno=s.nextInt();
		switch(empno) {
		case 1001:
			e.salary(1001,"Ashish","R&D",'e',20000,8000,3000);
			break;
		case 1002:
			e.salary(1002,"Sushma","PM",'c',30000,12000,9000);
			break;
		case 1003:
		    e.salary(1003,"Rahul","Acct",'k',10000,8000,1000);
		    break;
		case 1004:
			e.salary(1004,"Chahat","FrontDesk",'r',12000,6000,2000);
			break;
		case 1005:
			e.salary(1005,"Ranjan","Engg",'m',50000,20000,20000);
			break;
		case 1006:
			e.salary(1006,"Suman","Manufacturing",'e',23000,9000,4400);
			break;
		case 1007:
			e.salary(1007,"Tanmay","PM",'c',29000,12000,10000);
			break;
		default:
			System.out.println("There is no employee with empid :"+empno);
				
	}
  }
}
