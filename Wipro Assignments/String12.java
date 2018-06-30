package StringStringBuffer;

public class String12 {
public static void main(String[] args) {
	String s="",str="wipro";
	int a=3;
	for(int i=0;i<a;i++) {
		s=s+str.substring(str.length()-a);
	}
	System.out.println(s);
}
}
