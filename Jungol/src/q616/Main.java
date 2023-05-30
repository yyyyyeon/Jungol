package q616;

import java.util.Scanner;

public class Main {

	static int x1,x2,x3,y1,y2,y3;
	public static void Aga (int a1, int b1, int a2, int b2, int a3, int b3) {
		x1=a1;
		y1=b1;
		x2=a2;
		y2=b2;
		x3=a3;
		y3=b3;

	}
	public static double getx() {
		double ul = (double)(x1+x2+x3)/3;
		return ul;
	}
	public static double gety() {
		double ll = (double)(y1+y2+y3)/3;
		return ll;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int  x1, x2,x3,y1,y2,y3;
		 x1 = sc.nextInt();
		 y1 = sc.nextInt();
		 x2 = sc.nextInt();
		 y2 = sc.nextInt();
		 x3 = sc.nextInt();
		 y3 = sc.nextInt();
		sc.close();
		Aga(x1,y1,x2,y2,x3,y3);
		
		double ul = getx();		
		double ll = gety();
		System.out.printf("(%.1f, %.1f)",ul,ll);

	}

}
