package Arrays;

import java.util.Scanner;

public class Array05 {

	 public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			System.out.println("enter the values: ");
			int arr[]=new int[5];
			int min1,min2,max1,max2;
			for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
			min1=arr[0];
			for(int i=1;i<=arr.length;i++) {
				if(min1>arr[i])
					min1=arr[i];
				
			}System.out.println("Min value is: " +min1);		
			
			max1=arr[0];
			for(int i=1;i<=arr.length;i++) {
				if(max1<arr[i])
					max1=arr[i];
				max2=arr[i+1];
			}
			System.out.println("max value is: "+max1);
	}
}
