package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.print((a < b)? b-a:a-b);

	}

}