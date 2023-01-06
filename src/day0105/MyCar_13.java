package day0105;

public class MyCar_13 {

	private String carName;
	private int price;
	private String color;
	

	/*아주 깔끔하고 예쁜 코드를 짜보자!!!*/
		
	
	//생성자 이용하기
	public MyCar_13(String carName,int price,String color) {
		this.carName=carName;
		this.price=price;
		this.color=color;		
	}
	
	//출력 메서드
	public void printCarInfo() {
		System.out.println("자동차명: "+this.carName);
		System.out.println("차량가격: "+this.price);
		System.out.println("차량색상: "+this.color);
	}
	
	
	
	//getter&setter 이용하기 
	/*public void setCar(String carName,int price,String color) {
		this.carName=carName;
		this.price=price;
		this.color=color;
	}
	
	public void getCar() {
		System.out.println("자동차명: "+this.carName);
		System.out.println("자동차명: "+this.price);
		System.out.println("자동차명: "+this.color);
	}*/
	
	
}
