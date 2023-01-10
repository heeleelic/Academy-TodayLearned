package day0110;

//인터페이스는 상수와 추상 메서드만 존재하는 공간이다. 
//따라서 final, abstract 명시하지 않아도 당연히 final, abstract 이다.
//인터페이스는 다중 상속이 가능하다.

public interface FoodShop {
	
	String SHOPNAME="쌍용식당"; //final 상수
	
	public void order(); //abstract 메서드
	public void baedal(); 
	

}
