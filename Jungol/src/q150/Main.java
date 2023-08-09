package q150;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String a[]=new String [10];
		for(int i=0; i<10; i++) {
			String b =sc.next();
				a[i]=b;			
		}
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
