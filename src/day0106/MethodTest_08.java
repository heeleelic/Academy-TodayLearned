package day0106;

public class MethodTest_08 {
	
	public static void goodMorning(int age){
		System.out.println("좋은 아침입니다~!");
		System.out.println("제 나이는 "+age+"세 입니다.");
	}
	
	public static void hello(String name) {
		System.out.println("안녕?");
		System.out.println("내 이름은 "+name+"이야. 만반잘부~!");
	}
	

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		goodMorning(21);
		hello("지토");
		
		System.out.println();
		goodMorning(33);
		hello("남궁민수");
		System.out.println("프로그램 종료");

	}

}
