package flowcontrols;

import java.util.Scanner;

public class Flow12 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=s.nextInt(),count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;	
		}
		if(count==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}
}

