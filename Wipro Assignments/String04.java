package StringStringBuffer;

public class String04 {
 public static void main(String[] args) {
	 String str="CatDog";
	 int a=str.length();
	 int b=a/2;
	 if(a%2==0) 
		 System.out.println(str.substring(0, b));
	 else
		 System.out.println(str);
	 
 }
}
