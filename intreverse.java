
public class intreverse {
public static void main(String[] args) {
	int a=432,b;
	String s="";
	while(a!=0) {
		b=a%10;
		s+=b;
		a=a/10;
	}
	System.out.println(s);
}
}
