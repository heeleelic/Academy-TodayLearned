package day0104;

import java.util.Scanner;

public class ArraysSearch_02 {

	public static void main(String[] args) {
		//숫자를 입력하여 배열의 몇 번째인지 출력하고
		//없을 경우 없다고 출력
		//0 입력하면 종료
		
			
		int[] arr= {21,4,11,68,51,40,35,99,105};
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
				
		
		while(true) {
			
			System.out.println("숫자를 입력하세요.");
			int num=Integer.parseInt(sc.nextLine());
			
			if(num==0) break;
			
			flag=false;
			
					
			for(int i=0;i<arr.length;i++) {
				
				if(num==arr[i]) {
					flag=true;
					System.out.println(num+"은 "+(i+1)+"번째에 있습니다.");
				} 
			}
			
			if(!flag) System.out.println(num+"은 없습니다.");			
			
		}
		
			

	}

}
