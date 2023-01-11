package day0111;


class Server{
	
	int a=100;
	static int b=200;
	
	
	//스태틱 메서드처럼 스태틱 내부 클래스를 선언할 수 있다. 
	//외부 클래스의 인스턴스 변수 접근이 되지 않는다.
	static class Client{
		
		int c=300;
		static int d=400;
		
		public void write() {
			//System.out.println("외부 클래스 인스턴스 변수 a= "+a);
			System.out.println("외부 클래스 스태틱 변수 b= "+b);
			System.out.println("내부 클래스 인스턴스 변수 c= "+c);
			System.out.println("내부 클래스 스태틱 변수 d= "+d);
		}
	
		
	}
	
	
}


public class InnerVar_06 {

	public static void main(String[] args) {
	

		Server.Client n=new Server.Client(); //왜 new Server().Client()가 아닐까?? --> 스태틱 메서드처럼 사용하기 때문에 클래스명.으로 호출?? 
		n.write();
	}

}
