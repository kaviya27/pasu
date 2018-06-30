package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Array07 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=s.nextInt();
	System.out.println("enter the elements:");
	int arr[]=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	 int[] s1 = new int[size];
     int j = 0;  
     for (int i=0; i<size-1; i++){  
         if (arr[i] != arr[i+1]){
             s1[j] = arr[i];
             j++;
         }  
     }
     s1[j] = arr[size-1];
    
     
     for(int k=0;k<=j;k++)
    	 System.out.println(s1[k]);
	
 }
}
