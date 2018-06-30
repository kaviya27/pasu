package StringStringBuffer;

public class String09 {
public static void main(String[] args) {
	String str="ab**cd";
	int a=str.indexOf("*");
	int b=str.lastIndexOf("*");
	System.out.println(str.substring(0,a-1)+str.substring(b+2));
	
}
}
