package day0103;

import java.util.Scanner;

public class ArraySuchInt_06 {

	public static void main(String[] args) {
		
		/*선언된 배열에서 숫자를 입력하여 그 숫자가 있는지 찾기
		 * 없으면 없고, 있으면 몇 번째인지 출력하기
		 * 0 입력 시 종료*/

		int[] data = {12,54,7,88,61,25,20};
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			
			System.out.println("숫자가 있을까요?");
			num=sc.nextInt();
			
			if(num==0) break;
			
			flag=false; //나중에 찾게 되면 true
			
			//숫자 찾기
			for(int i=0;i<data.length;i++) {
				if(num==data[i]) {
					flag=true;
					System.out.println(i+1+"번째에서 찾았습니다.");
				}
			}
			
			//숫자 없는 경우 
			if(!flag) System.out.println(num+"은 없습니다.");
			
			
		}
		

	}

}
