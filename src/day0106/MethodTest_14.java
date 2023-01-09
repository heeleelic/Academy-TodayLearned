package day0106;

/*메서드 장점 및 작성 요령
 * 1.재사용할 수 있다.
 * 2.메서드 헤더 public static(인스턴스x) void(리턴x) 메서드명(arg 있으면 data type+arg명)
 * 3.리턴 값은 모든 데이터 타입 가능하다.
 * 4.하나의 메소드에는 하나의 기능만 두자. 
 * */


public class MethodTest_14 {
	
	public static boolean aaa() {
		return false;
	}

	public static int bbb() {
		return 10;
	}
	
	public static int ccc(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		

		boolean a=aaa();
		System.out.println("a="+a);
		
		int b=bbb();
		System.out.println("b="+b);
		
		int c=ccc(3, 4);
		System.out.println("c="+c);
	}

}
