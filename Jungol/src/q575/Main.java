package q575;

import java.util.Scanner;

public class Main {
	public static void Aga(int a, int b) {
		if (a <= 10 && b <= 10) {
			int result = (int) Math.pow(a, b);
			System.out.print(result);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		Aga(a, b);

	}

}
