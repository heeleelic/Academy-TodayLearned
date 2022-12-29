package day1229;

import java.util.Scanner;

public class QuizTest_17 {

	public static void main(String[] args) {
		
		//5개의 점수를 입력받아서 합계를 구하세요.(반복 입력)
		
		Scanner sc = new Scanner(System.in);
		int score;
		int sum=0;
		
		for(int i=1;i<6;i++) {
			System.out.println(i+"번 점수:" );
			score=sc.nextInt();
						
			if(score<1 || score>100) {
				System.out.println("잘못 입력했습니다."); 
				i--;
				continue;
			}
			
			sum+=score;
			
		}
		
		System.out.println("총 합계: "+sum);
		
		
		
		

	}

}
