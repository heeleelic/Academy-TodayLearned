package day0102;

import java.util.Scanner;


public class ReviewForWhile_01 {

	public static void whileTest(){
		
		Scanner sc=new Scanner(System.in);
		int input;
		int cnt=0;
		int sum=0;
		double avg;
		
		while(true) {
			System.out.println("점수 입력");
			input=Integer.parseInt(sc.nextLine());
					
			//break
			if(input==0) break;
			
			//continue
			if(input<0 || input>100) {
				System.out.println("\t다시 입력해주세요");
				continue;
			}
			
			cnt++;
			sum+=input;
			
		}
		
		avg=(double)sum/(double)cnt;
		System.out.println("총 개수: "+cnt);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		
	
	}
	
	public static void forTest() {
		
		//총 5개의 점수를 입력받아 합계를 구하려고 한다.
		//1~100이 아닐 경우 다시 입력받는다.
		
		Scanner sc=new Scanner(System.in);
		
		int input;
		int sum=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번 점수: ");
			input=sc.nextInt();
			
			if(input<1 || input>100) {
				System.out.println("\t잘못 입력했습니다.");
				i--;
				continue;
			}
			
			sum+=input;
		}
		
		
		System.out.println("총점: "+sum);
		
	}
	
	
	public static void main(String[] args) {
		
		//whileTest();
		forTest();
	}

}
