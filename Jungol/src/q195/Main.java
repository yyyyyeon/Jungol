package q195;

import java.util.Scanner;
class Aga {
	private String name;
	private String tel;
	private String addr;
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setTel(String tel) {
		this.tel= tel;
	}
	public void setAddr(String addr) {
		this.addr= addr;
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		sc.close();
		Aga myAga = new Aga();
		
		myAga.setName(name);
		myAga.setTel(tel);
		myAga.setAddr(addr);
		System.out.println("name : "+ myAga.getName());
		System.out.println("tel : "+ myAga.getTel());
		System.out.println("addr : "+ myAga.getAddr());
		

	}

}
