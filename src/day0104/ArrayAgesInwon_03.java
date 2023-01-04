package day0104;

import java.util.Scanner;

public class ArrayAgesInwon_03 {

	public static void main(String[] args) {		
		//총 10명의 나이를 입력받아서 나이 분포도를 출력하시오.
		//나이 입력: 55
		//나이 입력: 44 ... 
			
		
		
		int[] ages = new int[10]; // 10명의 나이 배열
		int[] inwon = new int[5]; // 5가지 연령대 배열(10대,20대,30대,40대,50대) 초깃값 모두 0 
		
		
		//10명의 나이 입력받기, 카테고리 카운팅하기		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<ages.length;i++) {	
			
			System.out.print("나이를 입력하시오. ");
			ages[i]=sc.nextInt();
			
			if (ages[i]<10 || ages[i]>=60) {
				System.out.println("유효한 나이가 아닙니다.");
				i--;
				continue;
			}
			
			inwon[ages[i]/10-1]++; // 14살이면 14/10-1 = 0번지 값 1 증가
			// 20살이면 20/10-1 = 1번지 값 1 증가 ... 
		}
		
		
		//나이 출력하기
		System.out.println("==입력된 나이는 다음과 같습니다.==");
		for(int a:ages) {
			System.out.print(a+" ");
		}
		
		
		//나이 분포도 출력하기
		System.out.println("==나이 분포도는 다음과 같습니다.==");
		for(int i=0;i<5;i++) {
			System.out.print((i+1)*10+"대: "+inwon[i]+"명  ");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
