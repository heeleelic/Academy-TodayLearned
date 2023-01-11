package day0111;

class OuterObj{
	
	class InnerObj{ //클래스지만 멤버처럼 사용이 가능하다
		public void write() { //내부 클래스의 멤버 메서드			
			System.out.println("내부 클래스의 멤버 메서드");
		}
		
	}
	
	
	public void disp() { //원래 만들던 멤버 메서드
		System.out.println("외부 클래스의 멤버 메서드");
		System.out.println("외부에서 내부 클래스의 메서드 호출");
		
		InnerObj innerObj=new InnerObj();
		innerObj.write();
	}
	
}



public class InnerClassTest_02 {
	

	public static void main(String[] args) {
		
		OuterObj outerObj=new OuterObj();
		outerObj.disp(); //외부 클래스의 멤버 메서드, 그리고 이 안에 있는 내부 클래스의 멤버 메서드, 결과적으로 2개의 클래스를 한번에 다룰 수 있다. 
		
		//InnerObj innerObj=new InnerObj(); 내부 클래스 자체의 객체를 생성할 수는 없지만
		
		//방법 1. 외부 클래스.내부 클래스로 생성할 수 있다.
		//OuterObj.InnerObj obj=new OuterObj().new InnerObj(); 
		
		
		//방법 2.외부 클래스 객체를 먼저 사용한 경우 이 객체를 통해 접근할 수도 있다.
		OuterObj.InnerObj obj=outerObj.new InnerObj();
		obj.write();
		
		

	}

}
