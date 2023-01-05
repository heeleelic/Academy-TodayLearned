package day0105;

public class MyInfoMain_09 {

	public static void main(String[] args) {
		
		//1.객체 생성
		MyInfo_09 info=new MyInfo_09();
		
		//2.setter 메서드 활용해서 값 설정
		info.setName("이성희");
		info.setAge(25);
		
		//3.getter 메서드 활용해서 값 얻기
		String name=info.getName();
		int age=info.getAge();
		
		//4.출력해보자
		System.out.println("name: "+name+", age: "+age);
		

	}

}
