package day0111;


//이벤트를 발생시키고, 바로 사라지게 할 때 익명 내부 클래스(Anonymous Class) 사용한다. 
//클래스 생성과 동시에 메모리만 잠깐 생겼다가 이벤트 종료 시 사라진다. 
//추상 클래스, 인터페이스로 익명 내부 클래스 

//추상 클래스
abstract class AbstEx{
	
	abstract public void show();
	
}


class OuterEx{

	AbstEx ab=new AbstEx() {
		
		@Override
		public void show() {
			//일회성이다.
			System.out.println("나는 익명 내부 클래스");
			
		}
	};
	
	
}


public class AnonyClass_04 {

	public static void main(String[] args) {
		

		//1회차 호출
		OuterEx outerEx=new OuterEx();
		outerEx.ab.show(); //외부 클래스.익명 내부 클래스(주로 인터페이스나 추상 클래스).메서드(); 
		
		//2회차 호출도 가능???
		OuterEx outerEx2=new OuterEx();
		outerEx2.ab.show(); // 
	}

}
