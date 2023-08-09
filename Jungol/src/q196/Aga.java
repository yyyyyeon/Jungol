package q196;

public class Aga {
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
	Aga (String name,String tel,String addr){
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	public void print() {
		System.out.println("name : " + this.name);
		System.out.println("tel : " + this.tel);
		System.out.println("addr : " + this.addr);
	}
}


