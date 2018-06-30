package Arrays;

import java.util.Scanner;

public class Array09 {
public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	
	System.out.println("enter the elements:");
	int arr[]=new int[7],sum=0,sum1=0,sum2=0,s = 0;
	for(int i=0;i<arr.length;i++) {
		arr[i]=n.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		
	}System.out.println(sum);
	
	for(int i=0;i<arr.length;i++){
		if(arr[i]==6) {
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==7) {
					for(int k=i;k<=j;k++) {
						sum1=sum1+arr[k];
					}
				}
			}
		}	
	}System.out.println(sum1);
	sum2=sum-sum1;
	System.out.println(sum2);
	
	}
}

