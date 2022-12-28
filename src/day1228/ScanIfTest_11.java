package day1228;

import java.util.Scanner;

public class ScanIfTest_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg,grade;
		
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());
		
		msg=score>=90?"장학생":score>=80?"좀 더 노력할 것!":"다음 기회에...";

		if(score>=90) grade="A";
		else if(score>=80) grade="B";
		else grade="C";
		
		System.out.println("점수: "+score);
		System.out.println("평가메시지: "+msg);
		System.out.println("학점: "+grade);
	}

}
