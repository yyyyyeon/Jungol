package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, e;
		while(true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if (2 <= s && s <= 9 && 2 <= e && e <= 9) break;
			else System.out.println("INPUT ERROR!");
		}
		

		for (int k = 1; k <= 9; k++) {
			if (s < e) {
				for (int i = s; i <= e; i++) {
					System.out.printf("%d * %d = %2d   ", i, k, i * k);
				}
				System.out.println();
			} else {
				for (int i = s; i >= e; i--) {
					System.out.printf("%d * %d = %2d   ", i, k, i * k);

				}
				System.out.println();
			}
		}
		sc.close();

	}
}