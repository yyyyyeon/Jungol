package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int odd = 0;
		int even = 0;
		while(true) {
			int a = sc.nextInt();
			if(a==0) {
				break;
			}
			if(a % 2 != 0) {
				odd++;
			}else {
				even++;
			}
		}
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

	}

}
