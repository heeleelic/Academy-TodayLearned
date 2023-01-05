package day0105;

public class StudentMain_03 {

	public static void main(String[] args) {
		
		Student_03.schoolName="역삼고등학교";
		
		Student_03 s1=new Student_03();
		s1.name="홍길동";
		s1.age=17;
			
		Student_03 s2=new Student_03();
		s2.name="김나영";
		s2.age=16;
		
		
		
		System.out.println("**클래스 멤버값 출력**");
		System.out.println("학교명: "+Student_03.schoolName);
		System.out.println();
		
		System.out.println("**학생 정보 1**");
		System.out.println("이름: "+s1.name);
		System.out.println("나이: "+s1.age);
		System.out.println();

		System.out.println("**학생 정보 2**");
		System.out.println("이름: "+s2.name);
		System.out.println("나이: "+s2.age);
	}

}
