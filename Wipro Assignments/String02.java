package StringStringBuffer;

public class String02 {
public static void main(String[] args) {
	String s1="Mark",s2="kate";
	if(s1.substring(s1.length()-1).equals(s2.substring(0,1))) {
	System.out.println(s1.substring(0)+s2.substring(1));
	}
	else
		System.out.println(s1+s2);
}
}
