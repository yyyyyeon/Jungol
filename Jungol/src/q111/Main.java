package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int sum=0;
		int [] a = {70, 95, 63, 100};
		for (int i=0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("sum "+sum);
		System.out.println("avg "+(sum/4));
		}
	}


