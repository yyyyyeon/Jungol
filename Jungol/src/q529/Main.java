package q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		
		System.out.println(weight + 100 - height);
		if( (weight + 100 - height) > 0) {
			System.out.println("Obesity");
		}
		
}
}
