package q614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in); 
	     School s = new School();
	        s.schoolName2 = sc.next();
	        s.grade2 = sc.nextInt();
	 
	        System.out.println(s.grade1 + " grade in " + s.schoolName1 + " School");
	        System.out.println(s.grade2 + " grade in " + s.schoolName2 + " School");
	    }
	}