package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.print(a != 0 && b!=0);
		System.out.print(a != 0 || b!=0);

	}

}
