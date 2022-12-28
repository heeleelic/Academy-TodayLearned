package day1228;

import java.util.Scanner;

public class QuizScoreMsg_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name=sc.nextLine();
		int java=sc.nextInt();
		int oracle=sc.nextInt();
		int spring=sc.nextInt();
		
		int sum=java+oracle+spring;
		double avg=sum/3;
		
	
		
		System.out.println("이름: "+name);
		System.out.println("자바 점수: "+java);
		System.out.println("오라클 점수: "+oracle);
		System.out.println("스프링 점수: "+spring);
		System.out.println("총점: "+sum);
		System.out.printf("평균: %.1f", avg);
		System.out.println("");
		
		if(avg>=80) System.out.println("합격");
		else if(avg>=70) System.out.println("노력할것");
		else System.out.println("불합격");
		
		

	}

}
