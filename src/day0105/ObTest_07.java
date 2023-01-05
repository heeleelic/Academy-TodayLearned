package day0105;


class ObTestA{
	
	private int x; //ObTestA만 접근할 수 있는 인스턴스 변수 
	private static int y; //ObTestA만 접근할 수 있는 스태틱 변수 
	
	//private 변수이면 다른 클래스에서는 메서드로 접근 가능하다.
	
	
	//인스턴스 메서드(멤버 메서드)_따로 객체 생성 안해도 this가 있기 때문에 접근 가능하다.  
	//다른 클래스에서 멤버 수정할 수 있게 하는 메서드 
	public void setX(int x) {
		this.x=x;
		
	}
	
	
	//다른 클래스에서 멤버 출력할 수 있게 하는 메서드
	public void getX() {
		System.out.println("x="+this.x);
	}
	
	
	
	//스태틱 메서드(멤버 매서드)_인스턴스 변수는 호출 못하고 스태틱 변수만 호출 가능하다.
	public static void setY(int y) {
		ObTestA.y=y;
		
	}
	
	public static void getY() {
		System.out.println("y="+ObTestA.y);
	}
	
	
}



public class ObTest_07 {

	public static void main(String[] args) {
		
		//ObTestA tA=new ObTestA();
		//tA.x=90;
		//System.out.println(tA.x); ObTest_07은 직접 접근할 수 없다.
		
		
		//x
		ObTestA ta1=new ObTestA();
		ta1.setX(90);
		ta1.getX();
		
		ObTestA ta2=new ObTestA();
		ta2.setX(100);
		ta2.getX();		
		
		//y - 스태틱은 클래스명으로 호출
		ObTestA.setY(200);
		ObTestA.getY();

	}

}
