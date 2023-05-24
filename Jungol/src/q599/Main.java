package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();

		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			if (b >= 'A' && b <= 'Z') {
				System.out.print(b);
			} else if (b >= 'a' && b <= 'z') {
				System.out.print((char) (b-32));

			}
		}

	}

}
