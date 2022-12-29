package day1229;

import java.util.Scanner;

public class WhileContinueBreak_08 {

	public static void main(String[] args) {
		
		//점수를 반복해서 입력 후 합계를 구한다.
		//1~100이 아닌 경우는 제외
		
		Scanner sc = new Scanner(System.in);
		int score;		
		int sum=0;
		
		while(true) {
			System.out.println("점수를 입력하시오");
			score=sc.nextInt();
			
			if(score==0) break;
			if(score<0 || score>100) continue;
			
			sum+=score;
		}
		
		System.out.println("총 합계:" + sum);

	}

}
