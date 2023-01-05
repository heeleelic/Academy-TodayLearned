package day0105;

class Numb{
	
	int num;
	
	//기본 생성자 뾰로롱
	public Numb() {
	
		num=10;
		System.out.println("기본 생성자 호출");
		
	}
	
	//인자를 전달받는 생성자 만들기
	//기본 생성자와 이름이 같게 할 수도 있다(=오버로딩) 
	//단, 오버로딩의 경우 인자를 전달받는다는 차이가 있다.

	public Numb(int num) {
		this.num=num; //Numb 객체를 만들 때 전달받은 인자를 써서 num으로 쓴다.
		System.out.println("아규먼트 생성자 호출");
	}
	
	
	//메소드는 매개변수와 리턴 값(없어도 됨)을 가지고 있다
	//[접근제한][자료형][리턴 값 없으면 void] 메소드명 
	
	//get 가지고 올 때. 인자 x
	//set 세팅하거나 수정할 때. 인자 o
	
	//getNumber() 메서드를 호출하면 num이 50이 된다. 
	public int getNumber() {
		
		num=50;
		
		return num;
	}
	
}


public class ConstTest_06 {
	
	public static void main(String[] args) {
		
		Numb num1=new Numb(); //인자를 전달받지 않는 기본 생성자
		System.out.println(num1.num); //기본 생성자 안에 있던 데이터.
		
		Numb num2=new Numb(30); //인자를 전달받는 아규먼트 생성자
		System.out.println(num2.num); //아규먼트 데이터 반영
		
		Numb num3=new Numb();
		System.out.println(num3.getNumber());
		

	}

}
