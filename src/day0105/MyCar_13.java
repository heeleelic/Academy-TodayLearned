package day0105;

public class MyCar_13 {

	private String carName;
	private int price;
	private String color;
	

	public void setCarName(String carName) {
		this.carName=carName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public void getCarName() {
		System.out.println("자동차명: "+this.carName);
	}
	public void getPrice() {
		System.out.println("차량가격: "+this.price);
	}
	public void getColor() {
		System.out.println("차량색상: "+this.color);
	}
	
	
}
