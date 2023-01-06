package day0106_1;


/*다른 패키지에서 클래스 만들 경우 접근 지정자에 따라 오류 상황이 생길 수 있다.
 *패키지가 다를 경우 생성자 앞에 반드시 public을 붙여야 접근이 가능하다.*/



public class Test_03 {
	
	private Test_03() {
		System.out.println("기본 생성자");
	}
	
	/*protected나 private으로 만들 경우에는
    *객체의 인스턴스를 얻을 수 있는 스태틱 메서드를 구현한다.
	*생성자 대신 인스턴스를 반환해주는 스태틱 메서드*/
	public static Test_03 getInstance() {
		return new Test_03();
	}
	

	public void writeMessage() {
		System.out.println("안녕하세요.");
	}
}
