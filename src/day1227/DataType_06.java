package day1227;

public class DataType_06 {

	public static void main(String[] args) {
		
		// 기본적인 자료형_8개
		//1.논리형 true,false
		boolean flag=false;
		
		//2.문자형
		//반드시 하나의 문자를 가지며,문자하나 2바이트
		//기본적으로 정수형,아스키코드로 변경가능...' '소따옴표로 표현
		char ch='가';
		
		//3.정수형
		byte a=-128; //1바이트, -128~127
		short b=32000;
		int c=670000; //32bit
		long d=100L;  //L을 안붙히면 기본형인 int를 의미하므로 뒤에 L,l을 붙힌다 //64bit
		
		
		//실수형
		double dou=3456.6781234;  //64bit
		float f=3.123434f; //뒤에 f를 붙히지 않으면 double로 인식 ..32bit
		
		//int,float 같은 32bit를 사용하지만,기본적으로 실수형이 정수형보다 큰타입으로 처리된다
		
		//출력
		System.out.println("flag="+flag);
		System.out.println("flag="+!flag);
		System.out.println("ch="+ch);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("dou="+dou); //정밀도 15자리
		System.out.println("f="+f); //8자리
		
		/*//전체자리수 10자리 소수점 2자리
		System.out.printf("dou=%10.2f\n",dou);
		//소수점1자리
		System.out.printf("dou=%.1f\n",dou);*/
		
		System.out.printf("dou=%10.2f\n", dou);
		System.out.printf("dou=%.1f\n", dou);
		
		
		
		

	}

}
