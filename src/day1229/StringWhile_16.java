package day1229;

import java.util.Scanner;

public class StringWhile_16 {

	public static void main(String[] args) {
		
		//startWith, equals 이용해서 반복문 안에서 입력, 종료
		//김씨가 몇 명인지 
		
		Scanner sc = new Scanner(System.in);
		String name;
		int cnt=0;
		
		while(true) {
			System.out.println("이름입력(종료=끝)");
			name=sc.nextLine();
			
			if(name.equals("끝")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			//조건
			if(name.startsWith("김")) cnt++;
			
		}
		
		System.out.println("김씨는 총 "+cnt+"명 입니다.");
		
		
		
		

	}

}
