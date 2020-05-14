//A JAVA program for area computation.

import java.util.*;

abstract class abs{
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
	public static int option(){
		clearScreen();
		System.out.println("A JAVA program for area computation.");
		System.out.println("\n\n1. Circle\n2. Triangle\n3. Rectangle\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		int choice = scan.nextInt();
		switch (choice) {
			case 1 : {
				System.out.print("Enter radius of circle : ");
				int r = scan.nextInt();
				System.out.println("Area of the given Circle is : " + (int)((22.0/7.0)*r*r) +" sq. units");
				break;
			}
			case 2 : {
				System.out.print("Enter base value : ");
				int b = scan.nextInt();
				System.out.print("Enter height value : ");
				int h = scan.nextInt();
				System.out.println("Area of the given Triangle is : " + (int)((1.0/2.0)*b*h) +" sq. units");
				break;
			}
			case 3 : {
				System.out.print("Enter length value : ");
				int l = scan.nextInt();
				System.out.print("Enter breadth value : ");
				int b = scan.nextInt();
				System.out.println("Area of the given Rectangle is : " + (l*b) +" sq. units");
				break;
			}
			default : {
				option();
				break;
			}
		}
		return 0;
	}
}

public class area extends abs{
	public static void main(String args[]){
		option();
	}
}