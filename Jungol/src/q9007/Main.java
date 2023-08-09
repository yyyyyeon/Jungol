package q9007;

//public class Main {
//
//	public static void main(String[] args) {
//		int a;
//		int b = 0;
//		System.out.println("수식을 출력하면 계산 결과가 출력됩니다.");
//		System.out.printf("10"+"5"+"=",a+b);
//
//	}
//
//}
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) {
	System.out.println("값의 수가 부족합니다.");
	System.exit(0);
}
	String strNum1 =  args[0];
	String strNum2 =  args[1];
	
	int num1 = Integer.parseInt(strNum1);	
	int num2 = Integer.parseInt(strNum2);

	int result = num1 + num2;
	System.out.println(num1 + " + " + num2 + " = " + result);
 }
}	
	
