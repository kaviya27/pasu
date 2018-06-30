package Arrays;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		int sum=0,avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many numbers sum: ");
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();	
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum is "+sum);
		System.out.println("avg is "+sum/a);
		
	}

}
