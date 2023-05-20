package q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		sc.close();
		if (n1>n3 && n2>n4) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
	}

}
