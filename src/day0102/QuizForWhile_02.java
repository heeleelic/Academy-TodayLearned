package day0102;

import java.util.Scanner;

public class QuizForWhile_02 {
	
	public static void quiz1(){
		//x의 y승
		//ex) 3의 5승 = 3*3*3*3*3
		
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=1;
		
		for(int i=0;i<y;i++) {
			a*=x;			
		}
		System.out.println(x+"의 "+y+"승은 "+a+"입니다.");
		
	}
	
	
	
	public static void quiz2(){
		
		//팩토리얼을 구할 숫자를 입력하여 결과값을 구해보세요.
		//5라고 입력하면 5!=120
		//1*2*3*4*5
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int fac=1;
		
		for(int i=1;i<=num;i++) {
			fac*=i;
		}
			
		System.out.println(num+"!="+fac);
	}
	
	
	public static void quiz3(){
		//1.Hello
		//  1:Java 2:Java 3:Java 4:Java
		//2.Hello
		//  1:Java 2:Java 3:Java 4:Java
		//3.Hello
		//  1:Java 2:Java 3:Java 4:Java
		
		//i=1일 때 j=1,2,3,4 
		//i=2일 때 j=1,2,3,4
		//i=3일 때 j=1,2,3,4
		for(int i=1;i<=3;i++) {
			System.out.println(i+".Hello");
			for(int j=1;j<=4;j++) {
				System.out.print("\t"+j+":Java ");
			}
			System.out.println("");
		}
		
	}

	
	public static void main(String[] args) {
		//quiz1();
		//quiz2();
		quiz3();

	}

}
