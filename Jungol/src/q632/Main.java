package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = 0;
		sc.close();
		min = (a < b) ? a : b; 
		min = (min < c) ? min : c; 
		System.out.print(min);
		

	}

}
