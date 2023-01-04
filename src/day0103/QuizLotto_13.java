package day0103;

import java.util.Scanner;

public class QuizLotto_13 {

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
		int cost=su*1000;		
		System.out.println("가격은 "+cost+"원 입니다.");
		
		
		for(int b=0;b<su;b++) {
			
		System.out.print(b+1+"회: ");
				
		
		int[] lotto=new int[6];
		
		//임의의 수를 생성해서 로또라는 변수 배열에 넣어준다.
		
		for(int i=0;i<lotto.length;i++) {
			
			lotto[i]=(int)(Math.random()*45)+1;
			
			//중복 처리
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) { //먼저 뽑았던 거랑 그 다음 거랑 비교하기(만약 같으면...)
					i--; 
					// 같은 번지에 다시 값을 구하기 위해서 
					// (i=3번째 값과 j=2번째 값이 동일할 경우, i=2로 돌아가고 break 걸려서, 
					// 첫번째 for문 가서 i++돼서 다시 i=3번쨰 값 구한다)
					break;
				}
			}
			
		}
		
		//오름차순 정렬
		for(int i=0;i<lotto.length-1;i++) {
			
			for(int j=i+1;j<lotto.length;j++) {
				
				if(lotto[i]>lotto[j]) {
					
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
						
			
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
		System.out.println();
		
		}
		

	}

}

