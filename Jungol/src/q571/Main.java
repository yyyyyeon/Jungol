package q571;

import java.util.Scanner;
class Munja {
	 Munja() {
		System.out.println("~!@#$^&*()_+|");
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			Munja myMunja= new Munja();
		}
		 
	}
}
