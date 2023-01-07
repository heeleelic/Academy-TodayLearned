package day0105;


class TestA{
	
	String name="이수진";
	static String MESSAGE="Happy day!!!";
	
}


public class ObTest_05 {
	
	int a;
	static int b;
	
	
	public static void main(String[] args) {
		
		b=20;
		System.out.println("b="+b);
		
		//인스턴스 변수는 인스턴스가 있어야 접근 가능
		
		ObTest_05 ob1=new ObTest_05();
		ob1.a=10;
		System.out.println("ob1.a="+ob1.a);
		
		TestA tA=new TestA();
		System.out.println(tA.name);
		System.out.println(TestA.MESSAGE);
		
		tA.name="이성희";
		System.out.println(tA.name);

	}

}
