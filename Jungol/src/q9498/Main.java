package q9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int score = sc.nextInt();
		sc.close();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("");
		}
}
}
		// switch
//		int s = score /10;
//		switch(s) {
//			case 10:
//			case 9:			
//				System.out.println("A");
//				break;
//			case 8:
//				System.out.println("B");
//			case 7:
//				System.out.println("C");
//			case 6:
//				System.out.println("D");
//			default:
//				System.out.println("F");
//		}