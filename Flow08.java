package flowcontrols;

import java.util.Scanner;

public class Flow08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the color code ");
		
		switch(s.next().charAt(0)){
			case 'r':
				System.out.println("Red");
				break;
			case 'g':
				System.out.println("Green");
				break;
			case 'b':
				System.out.println("Blue");
				break;
			case 'o':
				System.out.println("Orange");
				break;
			case 'y':
				System.out.println("Yellow");
				break;
			case 'w':
				System.out.println("white");
				break;
				default:
					System.out.println("Invalid Color");
		}
	}

}
