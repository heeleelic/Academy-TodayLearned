package day0110;

public class FruitInherit_02 {

	public static void main(String[] args) {
		
		/*Apple apple=new Apple();
		Banana banana=new Banana();
		Orange orange=new Orange();
		Kiwi kiwi=new Kiwi();
		
		apple.showMessage();
		banana.showMessage();
		orange.showMessage();
		kiwi.showMessage();*/
		
		
		
		
		//다형성 이용 (목적-하나의 변수로 여러 가지 기능을 처리할 때)
		//다형성은 하위 클래스로 생성한다. (부모로 자식을 생성한다)
		//부모클래스명 참조변수명 = new 자식클래스명;
		
		Fruit fruit;
		
		fruit=new Apple();
		fruit.showMessage();
		fruit.showTitle();
		
		fruit=new Banana();
		fruit.showMessage();
		
		fruit=new Orange();
		fruit.showMessage();
		
		fruit=new Kiwi();
		fruit.showMessage();
		
		
		

	}

}
