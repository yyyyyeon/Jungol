package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		if(a>=0 && a<= 4.5) {
		switch ((int) a) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
			break;
		}

	}

}
}