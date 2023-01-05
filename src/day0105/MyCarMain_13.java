package day0105;

public class MyCarMain_13 {

	public static void main(String[] args) {
		
		
		
		MyCar_13 oldCar=new MyCar_13();
		oldCar.setCarName("그랜져");
		oldCar.setPrice(4000);
		oldCar.setColor("진주색");
		
		System.out.println("**나의 자동차 정보***");
		oldCar.getCarName();
		oldCar.getPrice();
		oldCar.getColor();
		
		System.out.println();
		System.out.println("**자동차명 변경 후 출력***");
		MyCar_13 newCar=new MyCar_13();
		newCar.setCarName("제네시스 g80");
		newCar.setPrice(8000);
		newCar.setColor("그레이");
		
		newCar.getCarName();
		newCar.getPrice();
		newCar.getColor();
		

	}

}
