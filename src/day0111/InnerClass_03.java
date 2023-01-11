package day0111;

class Outer{
	
	String name="아이린";
	int age=25;
	
	
	//내부 클래스에서는 외부 클래스의 멤버 변수 사용이 가능하다. 
	//내부 클래스 #1
	class Inner1{
		
		public void disp1() {
			System.out.println("<==Inner1 내부 클래스==>");
			System.out.println("이름: "+name+", 나이: "+age);

		}		
	}
	
	//내부 클래스 #2
	class Inner2{
		
		public void disp2() {
			
			System.out.println("<==Inner2 내부 클래스==>");
			System.out.println("이름: "+name+", 나이: "+age);
			
		}
		
	}
	
	
	//외부 클래스 메서드
	public void disp() {
		
		//외부 클래스 메서드에서 내부 클래스 선언
		 Inner1 inner1=new Inner1();
		 inner1.disp1();
		 
		 Inner2 inner2=new Inner2();
		 inner2.disp2();
		
	}
	
	
	
	
}


public class InnerClass_03 {

	public static void main(String[] args) {
		
		
		
		Outer outer=new Outer();
		outer.disp();
		
		System.out.println("<==직접 내부 클래스의 메서드 호출하기==>");
		
		Outer.Inner1 outin1=new Outer().new Inner1();
		outin1.disp1();
		
		Outer.Inner2 outin2=outer.new Inner2();
		outin2.disp2();

	}

}
