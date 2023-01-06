package day0106;


class Mango{
	
	//인스턴스 변수, 스태틱 변수 선언 
	private String writer;
	private String subject;
	private static String MESSAGE="Happy Friday!!!";
	
	
	//게터 세터 생성
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMESSAGE() {
		return MESSAGE;
	}
	public static void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}
	
	
	
}




public class ObMethod_07 {
	
	//mango 클래스의 인자 값을 출력하는 메서드
	//static으로 만들어서 메인 메서드에서 바로 실행하자.
	//클래스 자체를 인자 값으로 받아서, 클래스의 변수와 메서드를 이용할 수 있다.
	public static void writeMango(Mango mango) {
		System.out.println("mango 클래스 출력===");
		System.out.println("작성자: "+mango.getWriter());
		System.out.println("제목: "+mango.getSubject());
	}
	
		

	public static void main(String[] args) {
		
		System.out.println("mango 클래스에서 메시지가 왔어요.");
		System.out.println(Mango.getMESSAGE());
		
		Mango m1=new Mango();
		m1.setWriter("마이클");
		m1.setSubject("오늘은 금요일");
		writeMango(m1);
		
		Mango m2=new Mango();
		m2.setWriter("아리아나");
		m2.setSubject("내일은 토요일");
		writeMango(m2);
		
	}

}
