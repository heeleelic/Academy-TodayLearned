package day0111;

class OuterClass{
	
	int a=10;
	static int b=20;
	
	class InnerClass{
		int c=30;
		// static int d=40; 내부 클래스에서는 스태틱 선언할 수 없다. 
	
		public void write() {
			System.out.println("외부 클래스 전역 변수 a = "+a);
			System.out.println("외부 클래스 스태틱 변수 b = "+b);
			System.out.println("내부 클래스 전역 변수 c = "+c);
		}
	}
}


public class InnerVar_05 {

	public static void main(String[] args) {
				
		OuterClass.InnerClass n=new OuterClass().new InnerClass();
		n.write();

	}

}






