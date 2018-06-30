package flowcontrols;

import java.util.Scanner;

public class Flow18 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=s.nextInt(),a,b=0,p=n;
	while(n!=0) {
		a=n%10;
		b=(b*10)+a;
		n=n/10;
	}System.out.println(b);
	if(b==p)
		System.out.println("is a palindrome");
	else
		System.out.println("is not a palindrome");
}
}
