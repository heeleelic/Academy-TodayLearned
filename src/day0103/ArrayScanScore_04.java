package day0103;

import java.util.Scanner;

public class ArrayScanScore_04 {

	public static void main(String[] args) {
		
		// 인원 수를 입력받고 이름, 점수 등을 입력받고 출력해보자.
		// 전체 합계와 평균 출력해보자. 
		// 등수 구하기 추가.
		
		int stu;
		String[] name;
		int[] score;
		int total=0;
		double avg=0;
		int[] rank;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수를 입력해주세요.");
		stu = Integer.parseInt(sc.nextLine()); //뒤에 문자 받을 거라서...
		
		//인원 수만큼 배열 할당
		name=new String[stu];
		score=new int[stu];
		rank=new int[stu];
		
		//인원 수만큼의 데이터 입력		
		for(int i=0;i<stu;i++) {
			System.out.printf(i+1+"번째 학생 ");
			name[i]=sc.nextLine();
			
			System.out.printf(i+1+"번째 학생의 점수 ");
			score[i]=Integer.parseInt(sc.nextLine());
			
			total+=score[i];
			
		}
		
		
		//등수 구하기 추가 (다중 for문)
		for(int i=0;i<stu;i++) { //기준 학생 세팅 		
			rank[i]=1;		
			for(int j=0;j<stu;j++) { //기준 학생과 비교 학생 세팅 				
				//비교되는 대상이 점수가 높으면 i번지 등수를 1씩 증가시킨다.
				if(score[i]<score[j]) rank[i]++; //1번째 사람 점수<2번째 사람 점수면 1번째 사람 등수 내려감.
			}
			
		}
		
		
				
				
		//출력
		// 번호 이름  점수
		// 1   홍길동 99
		// 2   김미미 89
		
		System.out.printf("번호\t이름\t점수\n");
		System.out.println("-------------------");
		
		
		for(int i=0;i<stu;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
			
		}
		
		System.out.println("총점: "+total);
		
		
		avg=(double)total/stu;
		System.out.println("평균: "+avg);
		

	}

}
