package restTime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*로또 몇 장 드릴까요? 3(입력)
		 *가격은 3000원 입니다. (출력)
		 *1회: (로또 숫자 6개)
		 *2회: (로또 숫자 6개)
		 *3회: (로또 숫자 6개)
		 *중복 안 되고, 오름차순 정렬*/

		System.out.println("로또 몇 장 드릴까요?");
		Scanner sc=new Scanner(System.in);
		int su=sc.nextInt();
		
		//최소 구매 1회 제한		
		if(su==0) {
			System.out.println("최소 구매는 1회입니다.");
			return;
		}
		
		int cost=su*1000;		
		System.out.println("가격은 "+cost+"원 입니다.");
		System.out.println();
		
				
		//구매 회차 su만큼 반복해서 로또 생성 
		for(int i=0;i<su;i++) {
						
			System.out.println(i+1+"회: ");
			
			int[] lotto = new int[6];
			
			
			
			//random() 사용해서 한 회차의 로또 번호 만들기
			
			for(int j=0;j<lotto.length;j++) {				
				lotto[j]=(int)(Math.random()*45)+1;
				
				//중복 제거
				for(int u=0;u<j;u++) {
					if(lotto[j]==lotto[u]) {
						j--;
						break;
					}
					
				}
			}
			
			
			//오름차순 정렬하기
			
			for(int w=0;w<lotto.length-1;w++) {
				for(int v=w+1;v<lotto.length;v++) {
					if(lotto[w]>lotto[v]) {
						int temp=lotto[w];
						lotto[w]=lotto[v];
						lotto[v]=temp;
					}
				}
			}
			
			
			
			for(int g=0;g<lotto.length;g++) {
				System.out.print(lotto[g]+" ");
			}
			
			
			System.out.println();
			
			
			
		}
		
		

		
	}

}
