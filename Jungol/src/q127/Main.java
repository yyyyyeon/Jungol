package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		while (true) {
			int a = sc.nextInt();
			if (a < 0 || a > 100) {
				break;
			}
			sum += a;
			avg++;
		}
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / avg);
		
	}

}
