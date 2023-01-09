package day0109;


public class ExMethod_01 {

	public static int sum(int a,int b) {
		System.out.println("1번째 함수 호출 "+a+"+"+b+"=?");
		return a+b;
	}
	
	public static double sum(int a,double b) {
		System.out.println("2번째 함수 호출 "+a+"+"+b+"=?");
		return a+b;
	}
	
	public static double sum(double a,int b) {
		System.out.println("3번째 함수 호출 "+a+"+"+b+"=?");
		return a+b;
	}
	
	public static double sum(double a,double b) {
		System.out.println("4번째 함수 호출 "+a+"+"+b+"=?");
		return a+b;
	}
	
	

	public static void main(String[] args) {
		
		//인자 타입에 따라서 자동으로 오버로딩 메서드 호출
		System.out.println(sum(3, 4));
		System.out.println(sum(2, 5.5));
		System.out.println(sum(4.5, 8));
		System.out.printf("%.2f", sum(3.6, 6.8));
	}

}
