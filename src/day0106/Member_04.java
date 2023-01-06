package day0106;

public class Member_04 {

	//변수 선언
	private String name;
	private String gender;
	private String address;
	
	static String acd;
	static int cnt=0;
	
	//setter
	public void setData(String name,String gender,String address) {
		this.name=name;
		this.gender=gender;
		this.address=address;
		
	}
	
	//출력 메서드
	public void writeData() {
		cnt++;
		System.out.println("학생 정보 "+cnt);
		System.out.println("이름: "+this.name);
		System.out.println("소속 학급: "+Member_04.acd);
		System.out.println("성별: "+this.gender);
		System.out.println("주소: "+this.address);
	}
	
}
