package p518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();		
		sc.close();
		System.out.println("sum : " +(a+b+c));
		System.out.print("avg : " +(a+b+c)/3);
	}

}
