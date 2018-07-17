
public class evenodd {
public static void main(String[] args) {
	String str="abcd";
	char temp;
	String s="";
	for(int i=0;i<str.length();i=i+2) {
		char c=str.charAt(i);
		char cc=str.charAt(i+1);
		temp=c;
		c=cc;
		cc=temp;
		s=s+c+cc;
	}System.out.println(s);
}
}
