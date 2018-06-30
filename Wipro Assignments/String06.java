package StringStringBuffer;

public class String06 {
public static void main(String[] args) {
	String s1="Hi",s2="Hello";
	if(s1.length()<s2.length())
		System.out.println(s1+s2+s1);
	else
		System.out.println(s2+s1+s2);
}
}
