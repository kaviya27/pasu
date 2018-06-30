package flowcontrols;

import java.util.Scanner;

public class Flow15 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=s.nextInt(),a,b=0;
	while(n!=0) {
		a=n%10;
		b=b+a;
		n=n/10;
	}System.out.println(b);
	
	
}
}
