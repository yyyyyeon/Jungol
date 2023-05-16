package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int [] a = new int[10];
		int b = Integer.MAX_VALUE;
		for ( int i=0; i < a.length; i++) {		
		a[i] =sc.nextInt();
		b = b < a[i] ? b : a[i];
		}
		sc.close();
		
		System.out.print(b);
	}

}
