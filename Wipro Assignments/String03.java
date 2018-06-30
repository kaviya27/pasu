package StringStringBuffer;

public class String03 {
public static void main(String[] args) {
	String str="Wipro";
	int a=str.length();
	String s="";
	if(a>=2) {
	for(int i=0;i<a;i++) {
		s=s+str.substring(0, 2);
	}
	System.out.println(s);
	}
}
}
