package q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		Integer a []  = new Integer [10];
		for (int i=0; i<a.length; i++ ) {
			a[i] =sc.nextInt();		
		}
		sc.close();
		Arrays.sort(a, Collections.reverseOrder()); 
		for (int i=0; i<a.length; i++ ) {
			System.out.print(a[i]+" ");
		}
				
	}

}
