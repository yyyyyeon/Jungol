package q574;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Aga myAga = new Aga();

		if(a<b&&a<c) {
			System.out.print(b);
		}
	}

}
