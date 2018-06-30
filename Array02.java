package Arrays;
import java.util.Scanner;
public class Array02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values: ");
		int arr[]=new int[5];
		int min,max;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Min value is: " +min);
		max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("max value is: "+max);
	}

}
