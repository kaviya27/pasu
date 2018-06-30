package Arrays;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many numbers sum: ");
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();	
		}char c = 0;
		for(int i=0;i<arr.length;i++) {
			 c=(char) arr[i];
			 System.out.print(" "+c+" ");
		}
		
	}

}
