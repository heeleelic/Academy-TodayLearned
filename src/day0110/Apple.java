package day0110;

public class Apple extends Fruit{

	@Override
	public void showMessage() {
		System.out.println(MESSAGE); //슈퍼 클래스명 생략 가능.
		System.out.println("Apple_ShowMessage");
		
	}

}
