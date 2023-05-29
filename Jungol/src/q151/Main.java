package q151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [5];
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		if(i%2==0) {	
			sum+=a[i];
		}
		}
		System.out.print(sum);

	}

}
