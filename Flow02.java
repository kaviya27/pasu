package flowcontrols;

import java.util.Scanner;

public class Flow02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		if(a%2==0)
			System.out.println("It is Even");
		else
			System.out.println("It is Odd");
	}

}
