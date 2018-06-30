package StringStringBuffer;

import java.util.Scanner;

public class String07 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String ");
	String str=s.next();
	if(str.substring(0,1).equals("x")&&str.substring(str.length()-1).equals("x")){
		System.out.println(str.substring(1,str.length()-1));
	}
	else if(str.substring(0,1).equals("x")){
		System.out.println(str.substring(1));
	}
	else if(str.substring(str.length()-1).equals("x")){
		System.out.println(str.substring(0,str.length()-1));
	}
	else
		System.out.println(str);
}
}
