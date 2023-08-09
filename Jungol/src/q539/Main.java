package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		while (true) {
			int inp = sc.nextInt();
			sum += inp;
			cnt++;
			if(inp >= 100) {
				break;
		 } 
	 }
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f\n", (double)sum / cnt);
	}
}
