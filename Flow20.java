package flowcontrols;

import java.util.Scanner;

public class Flow20 {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	char ch;
	do {
		System.out.println("Enter the number: ");
	         int a=s.nextInt(),b=s.nextInt();
		System.out.println(" 1.Add \t 2.Sub");
	    System.out.println("Enter your operation: ");
		     int c=s.nextInt();
		if(c==1)
			System.out.println(a+b);
		else if(c==2)
			System.out.println(a-b);
		else
			System.out.println("Enter valid option");
		System.out.println("Do u want to continue: ");
		     ch=s.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	System.out.println("u cancelled the operation");
}
}
