package StringStringBuffer;

public class String11 {
public static void main(String[] args) {
	String s1="abc",s2="xyz",s="";
	for(int i=0;i<s1.length();i++) {
		s+=s1.substring(i,i+1)+s2.substring(i,i+1);
	}
	System.out.println(s);
}
}
