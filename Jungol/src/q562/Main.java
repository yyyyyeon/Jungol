package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int a [] = new int [10];
		int sum= 0;
		double avg = 0;
		
		for(int i=0; i<a.length; i++){
			a[i] =sc.nextInt();
			if(i % 2 != 0) {
				sum += a[i];
			}else {
				avg += a[i];
			}
		}
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f",avg/(a.length/2));
	}

}
