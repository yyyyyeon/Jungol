package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String name = sc.nextLine();
		int a = 1;
		for(int i=0; i<name.length(); i++){
			if(name.charAt(i)==' ') {
				a++;
			}
			
		}
		sc.close();
		System.out.print(a);

	}

}
