package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int inp = 0, idx = 0;
		do {
			inp = sc.nextInt();
			ar[idx++] = inp;
		} while (inp != 0);
		sc.close();

		for (int i = 0; i < idx; i++) { // 0 1 2 3 4
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		// 4 3 2 1 0
		for (int i = idx - 2; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
	}
}