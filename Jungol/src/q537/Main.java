package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		int sum = 0;
		
		for(int i=1; i <= inp; i++) {
			sum = sum + i;
			}
		System.out.println(sum);
	}
		}

//	while	
//	int sum2 = 0;
//	int i2 = 0;
//	while (i2 <= inp) {
//		sum2 += i2++;
//	}