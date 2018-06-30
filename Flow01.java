package flowcontrols;

import java.util.Scanner;

public class Flow01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int a=s.nextInt();
		if(a>0) {
			System.out.println("It is Positive Value");
		}
		else if(a==0) {
			System.out.println("It is Zero value");
		}
		else
			System.out.println("It is Negative Value");
	}

}
