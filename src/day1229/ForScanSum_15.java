package day1229;

import java.util.Scanner;

public class ForScanSum_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int score;
		
		for(int i=1;i<=3;i++) {
			System.out.println(i+"번째 점수를 입력하시오(1~100)");
			score=sc.nextInt();
			
			if(score<1||score>100) {
				System.out.println("잘못된 점수입니다");
				i--;
				continue;
			}
			
			sum+=score;
		}
		
		System.out.println("==========");
		System.out.println("총 합계: "+sum);
		

	}

}
