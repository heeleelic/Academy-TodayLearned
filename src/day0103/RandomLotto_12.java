package day0103;

public class RandomLotto_12 {

	public static void main(String[] args) {
		
		int[] lotto=new int[6];
		
		//임의의 수를 생성해서 로또라는 변수 배열에 넣어준다.
		
		for(int i=0;i<lotto.length;i++) {
			
			lotto[i]=(int)(Math.random()*45)+1;
			
			//중복 처리
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
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
						
			
		System.out.println("<출력>");
		for(int a:lotto) {
			System.out.print(a+" ");
		}		

	}

}
