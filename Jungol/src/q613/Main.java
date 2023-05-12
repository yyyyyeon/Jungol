package q613;

import java.util.Scanner;
class School {
	String name;
	String school ;
	int grade;
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		School s1 = new School();

		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();

//		System.out.println(name);
//		System.out.println(school);
//		System.out.println(grade);

		s1.name = name;
		s1.school = school;
		s1.grade = grade;

//		Main s2 = new Main();
//		name = sc.next();
//		school = sc.next();
//		grade = sc.nextInt();
		sc.close();
//
//		s2.name = name;
//		s2.school = school;
//		s2.grade = grade;

		System.out.println("Name : " + s1.name);
		System.out.println("School : " + s1.school);
		System.out.println("Grade : " + s1.grade);
//		System.out.println("Name : " + s2.name);
//		System.out.println("School : " + s2.school);
//		System.out.println("Grade : " + s2.grade);



	}
}