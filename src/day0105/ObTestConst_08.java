package day0105;

/* 생성자: 객체 생성 시 자동 호출되는 일종의 메서드
 *  1. 일반 메서드와의 차이점: 리턴형이 없다.
 *  2. 기본 생성자명은 클래스명과 같아야 한다.
 *  3. 오버로딩이 가능하다.(같은 이름의 생성자들 가능)
 *  4. 생성자가 없을 경우 기본 생성자가 비가시적으로 작동하고 있다.
 *  5. 생성자는 멤버의 초기화를 담당한다.
 *  6. 아규먼트 생성자가 기본 생성자를 호출하려면 this()로 호출할 수 있다.(반드시 첫 줄!)*/

class Apple{
	
	public Apple() {
		System.out.println("Apple_기본 생성자 호출");
	}
}

class Banana{
	public Banana(String str) {
		System.out.println("Banana_아규먼트 생성자 호출 "+str);
	}
}

class Orange{
	public Orange() {
		System.out.println("Orange_기본 생성자 호출");
	}
	public Orange(String str) {
		System.out.println("Orange_아규먼트 str 생성자 호출 "+str);
		
	}
	public Orange(int n) {
		this(); // 기본 생성자 호출, 반드시 첫 줄에서 호출 , 보통은 생성할 경우가 없기는 하다. 
		System.out.println("Orange_아규먼트 int 생성자 호출 "+n);
	}
}



public class ObTestConst_08 {

	public static void main(String[] args) {
		
		
		Apple apple = new Apple();
		//Banana banana = new Banana(); 바나나에는 기본 생성자가 없다.
		
		Banana banana = new Banana("Happy");
		
		Orange orange1 = new Orange();
		Orange orange2 = new Orange("Enjoy");
		Orange orange3 = new Orange(3);
		

	}

}
