package q1870;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int [][] arr = new int [a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr[i][j] =sc.nextInt();
				System.out.println(arr);
			}
		}
		
	}
	

}
