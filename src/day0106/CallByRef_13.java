package day0106;

class MyCar{
	String carName;
	int carPrice;
	String carColor;
}


public class CallByRef_13 {
	
	//입력 메서드
	public static void dataIn(MyCar car) {
		car.carName="아우디";
		car.carPrice=2500;
		car.carColor="진주색";
	}
	
	
	//출력 메서드
	public static void dataOut(MyCar car) {
		System.out.println("차종명: "+car.carName);
		System.out.println("가격: "+car.carPrice);
		System.out.println("색상: "+car.carColor);
	}

	public static void main(String[] args) {
		
		MyCar car=new MyCar();
		dataIn(car);
		dataOut(car);

	}

}
