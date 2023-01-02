package day0102;

public class RandomTest_05 {

	public static void main(String[] args) {
		
		//자바에서 난수 구하기
		//1.Math.random() 메서드 이용
		//0.0<=r<1.0 (r은 double형, 0.0이상 1.0미만)
		
		//2.Random 클래스 만들고 생성자로 이용
		
		
		//10개의 난수 발생시키기
		for(int i=1;i<=10;i++) {
			double n=Math.random();
			System.out.println(n);
		}
		
		
		System.out.println("=====================");
		System.out.println("0~9 사이의 난수는 출력 가능?");
		
		for(int i=1;i<=10;i++) {
			int n = (int)(Math.random()*10);
			System.out.println(n);
		}
		
		
		System.out.println("==============================");
		System.out.println("1~10 사이의 난수는 출력 가능?");
		
		for(int i=1;i<=10;i++) {
			int n = (int)(Math.random()*10)+1;
			System.out.println(n);
		}
		
		
		System.out.println("==============================");
		System.out.println("1~45 사이의 난수는 출력 가능?");
		
		for(int i=1;i<=10;i++) {
			int n = (int)(Math.random()*45)+1;
			System.out.println(n);
		}
		
		
		System.out.println("==============================");
		System.out.println("1~100 사이의 난수는 출력 가능?");
		
		for(int i=1;i<=10;i++) {
			int n = (int)(Math.random()*100)+1;
			System.out.println(n);
		}
		
		
		System.out.println("==============================");
		System.out.println("65~90 사이의 난수는 출력 가능?");
		//65=m, 90=n, 곱하는 수는 n-m+1
		for(int i=1;i<=10;i++) {
			int n = (int)(Math.random()*26)+65;
			System.out.println(n);
		}
		
		
		System.out.println("==============================");
		System.out.println("65~90 사이의 난수를 문자로 출력 가능?");
		//65=m, 90=n, 곱하는 수는 n-m+1
		for(int i=1;i<=10;i++) {
			int n = (int)(Math.random()*26)+65;
			System.out.println((char)n);
		}
		
		
		
		
		

	}

}
