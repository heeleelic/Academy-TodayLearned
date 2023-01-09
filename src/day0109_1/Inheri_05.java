package day0109_1;

import day0109.SuperObj_05;

class SubObj extends SuperObj_05 {

	private String addr;
	
	//생성자
	public SubObj(String name,int age,String addr) {
		super(name, age); //상속받은 생성자 먼저 처리해줘야 한다.
		this.addr=addr;
	}
	
	//메서드
	public void writeData() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("주소: "+this.addr);
	}
	
}




public class Inheri_05 {

	public static void main(String[] args) {
		
		
		SubObj sub=new SubObj("이효리", 43, "제주시");
		sub.writeData();

	}

}
