package StringStringBuffer;

public class String01 {
public static void main(String[] args) {
	String str="Amma";
	String s="";
	for(int i=str.length()-1;i>=0;i--) {
		s+=str.charAt(i);
	}
	if(str.equalsIgnoreCase(s))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
}
}
