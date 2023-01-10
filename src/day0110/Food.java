package day0110;


//인터페이스는 다중 상속이 가능하다.
//인터페이스가 인터페이스를 상속받을 수도 있다. 이 때는 implements하지 않고 extends를 쓴다.

//클래스가 클래스를 extends
//클래스가 인터페이스를 implements
//인터페이스가 인터페이스를 extends

public class Food implements FoodShop{

	@Override
	public void order() {
		System.out.println(SHOPNAME);
		//SHOPNAME="김밥천국"; final이기 때문에 변경 안 됨.
		System.out.println("음식을 주문합니다.");
	}

	@Override
	public void baedal() {
		System.out.println(SHOPNAME);
		System.out.println("주문한 음식을 배달합니다.");
		
	}

}
