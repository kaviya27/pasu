package flowcontrols;

import java.util.Scanner;

public class Flow19 {
public static void main(String[] args) {
	int n = 1,count=0;
	while(count<5) {
		if(n%2==0 && n%3==0 && n%5==0) {
			System.out.println(n);
			count++;
		}
		n++;
	}
}
}
