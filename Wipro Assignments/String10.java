package StringStringBuffer;

public class String10 {
public static void main(String[] args) {
	String s1="Hello",s2="world",s="";
	if(s1.length()>=s2.length()) {
		for(int i=0;i<s2.length();i++) {
			s=s+s1.substring(i,i+1)+s2.substring(i,i+1);
		}System.out.println(s);
	}
	else {
		for(int i=0;i<s1.length();i++) {
			s=s+s2.substring(i,i+1)+s1.substring(i,i+1);
		}System.out.println(s);
	}
		

}
}
