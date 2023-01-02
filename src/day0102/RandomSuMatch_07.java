package day0102;

import java.util.Scanner;

public class RandomSuMatch_07 {

	public static void main(String[] args) {
		
		//숫자를 입력하여 그 숫자가 난수보다 작은지 큰지 추리하며 맞히기
			
		Scanner sc=new Scanner(System.in);		

		
		//1~100 사이의 난수 발생
		
		int rnd = (int)(Math.random()*100)+1;
		
		
		//난수 맞히기 
		
		int num;
		int cnt=0;
		
		while(true) {
			cnt++;
			System.out.println(cnt+"회차: ");
			num=sc.nextInt();
			if(num>rnd) System.out.println(num+"보다 작습니다.");
			else if(num<rnd) System.out.println(num+"보다 큽니다.");
			else {
				System.out.println("정답입니다~!");
				break;
			}
		}
		
		
		
		
		
		

	}

}
