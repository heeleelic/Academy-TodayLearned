package day0104;

import java.util.Scanner;

public class ArraySearchCnt_04 {

	public static void main(String[] args) {
		/*검색할 성을 입력해 주세요.
		 * 김
		 * 0: 김도희
		 * 1: 김병훈
		 * 2: 김영돈
		 * 	총 3명 검색
		 * 검색할 성을 입력해 주세요.
		 * 송
		 * 송씨 성을 가진 사람은 없습니다.
		 * 검색할 성을 입력해 주세요.
		 * 종료
		 * 종료합니다.*/
		
		Scanner sc=new Scanner(System.in);
		String[] names= {"김도희","김병훈","김영돈","박종수","권예지","이우형","이지영","서동익","지성용","서아랑"};
		String first;
		boolean find;
		
	while(true) {			
		
		//성 입력받기 
		System.out.println("검색할 성을 입력해 주세요.");
		first=sc.nextLine();
		
		//break문
		if(first.equals("종료")) {
			System.out.println("검색을 종료합니다.");
			break;
		}
		
		//배열에 있는지 확인하기
		find=false;
		int cnt=0; //성을 검색할 때마다 0으로 초기화되어 새로 인덱스할 수 있다. 
		
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith(first)) { //names의 데이터가 입력 값의 첫번쨰 글자로 시작할 때(성일 때)
				System.out.println(cnt+": "+names[i]); //i가 아니라 cnt로 해야 검색할 때마다 0으로 초기화
				cnt++;
				find=true;
				
			}	
			
		}
		
		if(cnt!=0) System.out.println("총 "+cnt+"명이 검색되었습니다."); //names에 있을 때만 인원 카운팅 가능하게	
		
		if(!find) System.out.println(first+"씨 성을 가진 사람은 없습니다.");
			
		
	}
		
		
		
		

	}

}
