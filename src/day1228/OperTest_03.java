package day1228;

public class OperTest_03 {

	public static void main(String[] args) {
		//증감 연산자 ++, --
		
		//1. 단항일 경우는 앞에 붙이나 뒤에 붙이나 동일하다 
		int a,b;
		a=b=5;
		
		++a; //원래 값에서 1씩 증가 
		b++; 
		
		System.out.println("a="+a+", b="+b); //a=6, b=6
		
		
		//2. 수식에서 사용할 경우는 전치, 후치의 결과가 다르다
		int m,n;
		m=n=0;
		a=b=5;
		
		m=a++; //후치는 먼저 대입 후 증가 
		System.out.println("m="+m+", a="+a); //m=5, a=6
		
		n=++b; //전치는 먼저 증가 후 대입 
		System.out.println("n="+n+", b="+b); //n=6, b=6

	}

}
