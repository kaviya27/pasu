package StringStringBuffer;

public class String08 {
public static void main(String[] args) {
	String s1="wipro",s2="X";
	int n=4;
	int a=s1.length(),b=s2.length();
	if(a>b) {
		for(int i=0;i<n-1;i++) {
		System.out.print(s1+s2);
	}
		System.out.println(s1);}
	else {
		for(int i=0;i<n-1;i++) {
		System.out.print(s2+s1);
	}
		System.out.println(s2);}	
}
}
