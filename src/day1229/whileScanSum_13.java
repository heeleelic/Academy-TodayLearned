package day1229;

import java.util.Scanner;

public class whileScanSum_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		
		int count=0;
	
		
		while(true) {
			System.out.println("숫자입력(종료:0)");
			num=sc.nextInt();
			
			//종료
			if(num==0) break;
			
			sum+=num;	
			count++;
			
		}
		double avg=(double)sum/count;
		System.out.println(sum);
		System.out.println(count);
		System.out.println(avg);

	}

}
