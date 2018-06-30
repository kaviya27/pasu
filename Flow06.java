package flowcontrols;

import java.util.Scanner;

public class Flow06 {
	public static double interest(String gender,int age) {
		if(gender=="male" && age>=1 && age<=60)
          System.out.println(9.2+"%");
		else if(gender=="male" && age>=61 && age<=120)
			System.out.println(8.3+"%");
		else if(gender=="female" && age>=1 && age<=58)
	          System.out.println(8.2+"%");
		else if(gender=="female" && age>=59 && age<=120)
			System.out.println(7.6+"%");
	      
          return 0;
	}
          
          
          
	public static void main(String[] args) {
		String gender;
		int age;
		double interest;
		Scanner s=new Scanner(System.in);
		interest("male", 60);
		
	}

}
