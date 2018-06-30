package Arrays;

public class Array11 {
public static void main(String[] args) {
	int arr[][]=new int[3][3],p=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			arr[i][j]=Integer.parseInt(args[p]);
			System.out.print(arr[i][j]+" ");
			p++;
		}System.out.println();
	}int max=0;
	max=arr[0][0];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(max<arr[i][j]) {
				max=arr[i][j];
			}
		}
	}System.out.println("Maximum value is: "+max);
	
}
}
