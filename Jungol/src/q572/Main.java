package q572;

import java.util.Scanner;

class Aga {
	void area(int a) {
		System.out.printf("%.2f", (double) a * a * 3.14);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		Aga myAga = new Aga();
		myAga.area(a);
	}

}
