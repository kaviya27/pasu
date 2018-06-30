package flowcontrols;

import java.util.Scanner;

public class flow17 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int a=s.nextInt(),b,c=0;
	while(a!=0) {
		b=a%10;
		c=(c*10)+b;
		a=a/10;
		
	}System.out.println(c);
	
}
}
