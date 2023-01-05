package day0105;

public class MyInfo_09 {

	private String name;
	private int age;
	
	
	/*Setter 메서드
	 * 1. 인스턴스 변수에 저장된 데이터를 수정할 목적으로 사용한다_set변수명
	 * 2. 수정이 목적이므로 리턴 값이 없다(void)
	 */
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	
	/* getter 메서드
	 * 1. 인스턴스 변수에 저장된 데이터를 조회할 목적으로 사용한다_get변수명
	 * 2. 조회가 목적이므로 매개변수가 없다.
	 * 3. 리턴 값을 반환한다.*/
	
	
	public String getName() {
		return name;
	}
		
	public int getAge() {
		return age;
	}
	
}
