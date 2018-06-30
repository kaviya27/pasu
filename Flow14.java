package flowcontrols;

import java.util.Scanner;

public class Flow14 {
public static void main(String[] args) {
	
	try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
	int n=s.nextInt(),count=0;
	
	if(n==0 || n==1)
		System.out.println(n+" is neither prime and composite");
	else if(n>=2) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;	
		}
		if(count==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}
}catch(Exception e) {
	System.out.println("invalid ");
	System.out.println("Please Enter a integer number");
}
}
}
