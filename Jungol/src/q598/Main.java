package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
			
		while(true) {
			char a = sc.next().charAt(0);
			if('A' <= a && a <='Z') {
				System.out.println(a);
			}else if('a'<= a && a<='z') {
				System.out.println(a);
			}else if('0' <= a && a <= '9') {
				System.out.println((int)a);
			}else {
				break;
			}
		}
		sc.close();
	}	
	

}
