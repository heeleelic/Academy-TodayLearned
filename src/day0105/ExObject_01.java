package day0105;

/* 객체를 자바 프로그램으로 개발하기 위해서 클래스 형태로 표현한다.
 * 객체의 속성은 인스턴스 변수로 표현하고,
 * 객체의 동작은 메서드로 표현한다.
 * Object: 객체(붕어빵)
 * class: 객체를 생성하기 위한 존재(설계도면,붕어빵틀)
 * instance: 클래스에서 만들어진 객체를 인스턴스라고 표현하는 것.
 * */

/*멤버 변수 &메소드도 적용.
 * 1. 인스턴스 변수(객체 변수) - 공유되지 않는다.
 * 2. 스태틱 변수(클래스 변수) - 클래스에서 a,b,c 객체가 생성될 때 다들 공유하는 변수 */



public class ExObject_01 {

	String name; //인스턴스 변수, 객체 생성 후 각각의 다른 값을 가질 수 있다.
	static final String MESSAGE="Happy day!!!"; //스태틱 변수, final 붙이면 변경 x 상수된다.
	
	//클래스명.참조변수명 = new 클래스명();으로 객체 생성 후 
	//참조변수를 통해 인스턴스 변수 name에 값을 넣을 수 있다. 
	
	//스태틱 변수 MESSAGE는 다른 클래스에서 클래스명.변수명으로 호출한다. ExObject_01.MESSAGE;
	//단, 같은 클래스 내부에서는 MESSAGE; 로 클래스명 생략하고 호출 가능하다.
	
	
	public static void main(String[] args) {
		
		System.out.println("스태틱 변수는 new로 생성 없이 바로 호출 가능");
		System.out.println(ExObject_01.MESSAGE); //클래스명.변수명으로 호출 
		System.out.println(MESSAGE); //같은 클래스 내부니까 클래스명 생략 가능
		//MESSAGE="nice"; -> final에서는 값 변경 안됨 
		
		
		//인스턴스 변수 name은 new로 객체 생성 없이는 불러올 수 없다. 
		ExObject_01 ob1= new ExObject_01();
		ob1.name = "성희";
		System.out.println(ob1.name);
		
		
		ExObject_01 ob2= new ExObject_01();
		ob2.name = "혜진";
		System.out.println(ob2.name);

		
		System.out.println("다같이 쓰는 메시지: "+MESSAGE);
	}

}
