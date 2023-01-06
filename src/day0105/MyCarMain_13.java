package day0105;

public class MyCarMain_13 {

	public static void main(String[] args) {
		
		System.out.println("**나의 자동차 정보**");
		MyCar_13 oldCar=new MyCar_13("그랜져", 4000, "진주색");
		oldCar.printCarInfo();
		
		System.out.println("\n**자동차명 변경 후 출력**");
		MyCar_13 newCar=new MyCar_13("제네시스 g80", 8000, "그레이");
		newCar.printCarInfo();


	}

}
