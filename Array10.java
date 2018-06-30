package Arrays;

import java.util.Scanner;

public class Array10 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int arr[][]=new int[2][2];
	int i,j,r=0 ;
	for(i=0;i<2;i++) {
		for(j=0;j<2;j++) {
			arr[i][j]=Integer.parseInt(args[r]);
			System.out.print(arr[i][j]+" ");
			r++;
		}System.out.println();
	}
	r=3;
	System.out.println("Reverse Matrix");
	for(i=0;i<2;i++) {
		for(j=0;j<2;j++) {
			arr[i][j]=Integer.parseInt(args[r]);
			System.out.print(arr[i][j]+" ");
			r--;
		}System.out.println();
	}
	
}
}
