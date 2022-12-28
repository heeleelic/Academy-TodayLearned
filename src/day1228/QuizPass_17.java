package day1228;

import java.util.Scanner;

public class QuizPass_17 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("응시자명");
	String name=sc.nextLine();
	System.out.println("국,영,수 점수");
	int kor = sc.nextInt();
	int eng = sc.nextInt();
	int math = sc.nextInt();
	
	int sum=kor+eng+math;
	double avg=sum/3.0;
	String msg;
	
	if(avg>=60 && kor>=40 && eng>=40 && math>=40) msg="합격";
	else msg="불합격";
	
		
	System.out.println("국어:"+kor+", 영어:"+eng+", 수학:"+math);
	System.out.println(name+"님은 "+msg+" 입니다");
		
		

	}

}
