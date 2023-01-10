package day0110;

/*추상 클래스
 * 1. new 예약어로 인스턴스 만들 수 없다.
 * 2. 추상 메서드는 추상 클래스에서만 존재한다.
 * 3. 추상 클래스 -> 추상 메서드, 일반 메서드 둘 다 포함할 수 있다.*/


//슈퍼 클래스
public abstract class Fruit {

	//상수
	public static final String MESSAGE="화요일의 과일가게";
	
	//일반 메서드
	public void showTitle() {
		System.out.println("===추상 클래스===");
	}
	
	//추상 메서드(헤더만 존재, 오버라이딩 목적)
	public abstract void showMessage();
	
}
