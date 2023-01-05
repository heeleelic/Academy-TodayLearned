package day0105;

public class CardMain_02 {

	public static void main(String[] args) {
		
		//스태틱 변수 호출하기
		System.out.println(CardTest_02.width);
		System.out.println(CardTest_02.height);
		
		//final 없으니까 스태틱 변수에 값 넣기
		CardTest_02.width=10;
		CardTest_02.height=20;
		System.out.println(CardTest_02.width);
		System.out.println(CardTest_02.height);
		
		//인스턴스1 만들어서 인스턴스 변수 호출하기
		CardTest_02 c1=new CardTest_02();
		System.out.println(c1.kind);
		System.out.println(c1.num);
		
		//인스턴스 변수에 값 넣기 
		c1.kind="heart";
		c1.num=7;
		System.out.println(c1.kind);
		System.out.println(c1.num);
		
		//인스턴스 2 만들어서 값 넣기
		CardTest_02 c2=new CardTest_02();
		c2.kind="spade";
		c2.num=4;
		System.out.println(c2.kind);
		System.out.println(c2.num);
		
		System.out.println(c1.kind+","+c1.num+","+CardTest_02.width+","+CardTest_02.height);

	}

}
