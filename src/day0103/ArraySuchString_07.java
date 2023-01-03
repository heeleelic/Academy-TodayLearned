package day0103;

import java.util.Scanner;

public class ArraySuchString_07 {

	public static void main(String[] args) {
		//이름을 입력하여 있으면 몇 번째, 없으면 없다고 출력 (Q 입력 시 종료)
		
		String[] data = {"김영돈","김희수","주하랑","이성희","이지민","권예지","김병훈","이우형"};
		boolean bool;	
		Scanner sc = new Scanner(System.in);
		String name;
		
		
		while(true) {		
			
			System.out.println("찾으시는 분의 성함은?");
			name = sc.nextLine();
			
			//break
			if (name.equals("Q")) {
				System.out.println("종료합니다.");
				break;
			}
			
			bool=false;
			
			//값 찾기
			for(int i=0;i<data.length;i++) {
				if(name.equals(data[i])) {
					bool=true;
					System.out.println(i+1+"번째 방에 계십니다.");
				}
			}
			
			if(!bool) System.out.println(name+"님은 내부에 없습니다.");
					
		}		

	}

}
