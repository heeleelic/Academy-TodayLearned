package day0105;

class Person{
	
	String name;
	int age;
	
	//디폴트 생성자
	public Person() {
		this("홍길동",11); //호출 출력
		System.out.println("기본 생성자"); //기본 생성자 출력
	}
	

	public Person(String name) {
		this(name,14); 
	}
	
	public Person(int age) {
		this("김영희",age); 
	}
	
		
	//인자 2개를 넘겨주는 생성자 만들기
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		
		System.out.println("호출");
	}
	
	
	//메서드 만들기
	public void write() {
		System.out.println("이름: "+name+" 나이: "+age);
		
	}
}




public class ExObConst_11 {

	public static void main(String[] args) {
		
		Person person1=new Person(); //호출, 기본생성자
		person1.write();  //이름: 홍길동 나이: 11
		
		Person person2=new Person("이성희"); //호출 
		person2.write(); //이름: 이성희 나이: 14
		
		Person person3=new Person(45); //호출
		person3.write(); //이름: 김영희 나이: 45
		
		Person person4=new Person("김미미", 13); //호출
		person4.write(); //이름: 김미미 나이: 13
		
		
	}

}
