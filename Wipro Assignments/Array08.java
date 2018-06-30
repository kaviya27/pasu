package Arrays;

import java.util.Scanner;

public class Array08 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the numbers: ");
	int arr[]=new int[5],out=0,count=0,max = 0;
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j])
				count++;
			if(max<count) {
				max=count;
				out=arr[i];	}			
		}
		count=0;
	}System.out.println(out);
}
}
