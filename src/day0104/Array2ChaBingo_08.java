package day0104;

import java.util.Scanner;

public class Array2ChaBingo_08 {

	public static void main(String[] args) {
		//3행 3열로 2차원 배열 만들고, 엔터를 누르면 1~3까지의 난수 발생
		//가로,세로,대각선에서 같은 숫자가 나오면 빙고.
		//종료: q
		
		
		int[][] arr=new int[3][3]; //3행 3열 생성
				
		Scanner sc=new Scanner(System.in); //엔터 값 입력받기
		
		int bingo; //빙고 카운트
		
		
		System.out.println("***같은 숫자 3개가 나오면 빙고! 엔터를 눌러주세요.");
		
		
		while(true) {		
						
			String ent=sc.nextLine();
			
			//종료
			if(ent.equals("q")) {
				System.out.println("게임을 종료합니다");
				break;
			}
						
			//3행 3열의 배열에 난수 발생
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=(int)(Math.random()*3)+1;
				}
			}
						
			//출력			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
					
			//빙고 구하기
			
			bingo=0;
			
			//가로 3개, 세로 3개
			for(int i=0;i<arr.length;i++) {
				
				//가로 방향 비교			
					if(arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2]) bingo++;
				//세로 방향 비교
					if(arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i]) bingo++;
				
			}
			
			//대각선 2개
			if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]) bingo++;
			if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]) bingo++;
					
				
			//빙고 출력하기
			if(bingo==0) System.out.println("노빙고");
			else System.out.println("빙고 "+bingo+"개입니다! 추카추카추");
			
						
			//다음 회차 예고
			System.out.println();
			System.out.println("엔터를 누르면 다음 숫자가 나옵니다(종료:q)");
			System.out.println();
				
			
			
		
		}

	}

}
