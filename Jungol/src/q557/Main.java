package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		char [] a = new char[10];
		
		for (int i = 0; i < a.length; i++) {
			a [i]=sc.next().charAt(0);
		}
		sc.close();
		System.out.printf("%c %c %c", a[0],a[3],a[6]);
	}

}
