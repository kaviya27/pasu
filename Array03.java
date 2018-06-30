package Arrays;

import java.util.Scanner;

public class Array03 {
	public static void position() {
		int arr[]=new int[] {24,84,35,64,75};
		Scanner s=new Scanner(System.in);
		System.out.println("enter the search value: ");
		int a=s.nextInt(),out=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a)
				out=i;	
			
		}
		
			System.out.println(out);
	}

	public static void main(String[] args) {
		position();
		
	}
}