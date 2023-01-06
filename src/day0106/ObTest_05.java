package day0106;

class Jungbo{
	private String name;
	private String address;
	private String hp;
	
	//기본 생성자
	public Jungbo() {
		
	}
	
	//게터 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//3개의 멤버 한번에 수정하는 메서드
	public void nJungbo(String name,String address,String hp) {
		this.name=name;
		this.address=address;
		this.hp=hp;
	}
	
	//3개의 멤버 한번에 프린트하는 메서드 
	public void pJungbo() {
		System.out.println("이름: "+name);
		System.out.println("주소: "+address);
		System.out.println("연락처: "+hp);
	}
	
	
}


public class ObTest_05 {

	public static void main(String[] args) {
		
		Jungbo jb1=new Jungbo();
		
		jb1.setName("유재석");
		jb1.setAddress("서울시 강동구");
		jb1.setHp("010-0000-0000");
		
		System.out.println("======getter & setter");
		System.out.println("이름: "+jb1.getName());
		System.out.println("주소: "+jb1.getAddress());
		System.out.println("연락처: "+jb1.getHp());
		
		Jungbo jb2=new Jungbo();
		
		System.out.println("=======세 개 한 번에");
		jb2.nJungbo("강호동", "서울시 중구", "010-1234-5678");
		jb2.pJungbo();

	}

}
