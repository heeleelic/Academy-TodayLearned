package day0109;

//부모 클래스가 다른 패키지에 있을 때는 protected, public 변수 접근 가능
//depault 같은 패키지 가능
//private 같은 클래스 가능 


public class SuperObj_05 {
	
	protected String name;
	protected int age;
	
	//아규먼트 생성자
	public SuperObj_05(String name,int age) {
		this.name=name;
		this.age=age;
	
	}

}
