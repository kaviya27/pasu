package flowcontrols;

import java.util.Scanner;

public class Flow05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value: ");
		char a=s.next().charAt(0);
		if(a>=48 && a<=57 )
			System.out.println("Digits");
		else if(a>=65 && a<=90 || a>=97 && a<=122)
			System.out.println("alphabets");
		else
		System.out.println("Special characters");
	}

}
