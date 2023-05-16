package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		String k= sc.next();
		int a = sc.nextInt();
		sc.close();
		for (int i=k.length()-1;(a > 0 && i>= 0); i--,a--) {
			System.out.print(k.charAt(i));
		}
	}

}
