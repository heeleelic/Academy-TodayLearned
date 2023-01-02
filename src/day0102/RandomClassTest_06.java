package day0102;

import java.util.Random;

public class RandomClassTest_06 {

	public static void main(String[] args) {
		//Random 클래스를 이용해서 난수 생성하기
		
		Random r = new Random();
		
		System.out.println("0~9 사이 난수 5개 생성");
		
		for(int i=1;i<=5;i++) {
			int n = r.nextInt(10); //리턴 값 int, 0~9
			System.out.println(n);
		}

		System.out.println("===================");
		
		System.out.println("0~99 사이 난수 5개 생성");
		
		for(int i=1;i<=5;i++) {
			int n = r.nextInt(100); 
			System.out.println(n);
		}
		
		System.out.println("===================");
		
		System.out.println("1~10 사이 난수 5개 생성");
		
		for(int i=1;i<=5;i++) {
			int n = r.nextInt(10)+1; 
			System.out.println(n);
		}
		
System.out.println("===================");
		
		System.out.println("A~Z(65~90) 사이 난수 5개 생성");
		
		for(int i=1;i<=5;i++) {
			int n = r.nextInt(26)+65; 
			System.out.println((char)n);
		}
		
	}

}
