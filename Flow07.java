package flowcontrols;

import java.util.Scanner;

public class Flow07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the char");
		String ch=s.next().toString();
		if(ch.charAt(0)>='A' && ch.charAt(0)<='Z')
			System.out.println(ch.toLowerCase());
		else if(ch.charAt(0)>='a' && ch.charAt(0)<='z')
			System.out.println(ch.toUpperCase());
		else
			System.out.println(ch);
	}

}
