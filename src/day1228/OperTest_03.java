package day1228;

public class OperTest_03 {

	public static void main(String[] args) {
		//증감 연산자 ++, --
		
		//1. 단항일 경우는 앞에 붙이나 뒤에 붙이나 동일하다 
		int a=5;
		int b=5;
				
		++a; //원래 값에서 1씩 증가 
		b++; 
		
		System.out.println("a="+a+", b="+b); //a=6, b=6
		
		
		//2. 수식에서 사용할 경우는 전치, 후치의 결과가 다르다
		int m=0;
		int n=0;
		
		int c=5;
		int d=5;
		
		m=c++; //후치는 먼저 대입 후 증가 
		System.out.println("m="+m+", c="+c); //m=5, c=6
		
		n=++d; //전치는 먼저 증가 후 대입 
		System.out.println("n="+n+", d="+d); //n=6, d=6

	}

}
