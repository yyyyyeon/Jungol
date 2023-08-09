package q196;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		
		Aga myAga = new Aga(name, tel, addr);	
		
		name=sc.next();
		tel = sc.next();
		addr = sc.next();
		
		Aga myAga2 = new Aga(name, tel, addr);
		
		name=sc.next();
		tel = sc.next();
		addr = sc.next();
		
		Aga myAga3 = new Aga(name, tel, addr);
		
		if(myAga.getName().charAt(0)<myAga2.getName().charAt(0)&&myAga.getName().charAt(0)<myAga3.getName().charAt(0)) {
			myAga.print();
		}else if(myAga2.getName().charAt(0)<myAga.getName().charAt(0)&&myAga2.getName().charAt(0)<myAga3.getName().charAt(0)) {
			myAga2.print();
		}else {
			myAga3.print();
		}
	}

}
