package day1227;

public class DataType_07 {

	public static void main(String[] args) {

		byte a=127;//-128~127
		byte b=(byte)128; //더작은 자료형으로 변환..값손실(디모션)
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//강제형변환(cast연산자)를 바르게 사용하기
		int x=7;
		int y=4;
		
		System.out.println(x/y); //1.정수형끼리의 계산결과는 무조건 정수 int
		System.out.println((double)x/y); //계산시 x를 double로 변환해서 계산: 결과는 double
		System.out.println(x/(double)y); //수식중 한개라도 double이 있으면 결과는 double
		
		
		double d=100;
		int i=100;
		int result=(int)d+i;
		double result2=(double)d+i;
		
		
		System.out.println("d="+d); // 100.0
		System.out.println("i="+i); // 100
		System.out.println("result="+result); // 200
		System.out.println("result2="+result2); //200.0
		
		
	}

}
