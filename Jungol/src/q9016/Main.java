package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("키를 입력하세요. ");
		int a =sc.nextInt();
		System.out.print("몸무게를 입력하세요. ");
		double b = sc.nextDouble();
		System.out.print("이름을 입력하세요. ");
		String c = sc.next();

		
		sc.close();
		
		System.out.println("키" + " = " + (a));
		System.out.printf("몸무게" + " = %.1f\n", b );
		System.out.print("이름" + " = " + (c));
		
		
		

	}

}
