package day1228;

import java.util.Scanner;

public class OperTest_06 {

	public static void main(String[] args) {
		
		//두개의 정수값을 입력받아서 산술연산자(+,-,*,/,%) 이용하기
		
		Scanner sc = new Scanner(System.in);
		
		int su1, su2;
		int add,sub,mul,div,mod;
		
		System.out.println("두개의 숫자 입력하세요");
		su1=sc.nextInt();
		su2=sc.nextInt();
		
		add=su1+su2;
		sub=su1-su2;
		mul=su1*su2;
		div=su1/su2;
		mod=su1%su2;
		
		System.out.println("****결과값 출력****");
		System.out.println("su1+su2="+add);
		System.out.println("su1-su2="+sub);
		System.out.println("su1*su2="+mul);
		System.out.println("su1/su2="+div);
		System.out.println("su1%su2="+mod);
		

	}

}
