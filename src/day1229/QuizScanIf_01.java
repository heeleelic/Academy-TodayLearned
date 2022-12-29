package day1229;

import java.util.Scanner;

public class QuizScanIf_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name=sc.nextLine();
		int count=Integer.parseInt(sc.nextLine());
		int price=Integer.parseInt(sc.nextLine());
		
		int sum=count*price;
		
		//count>=5 , 10% d.c
		
		System.out.println(name+" "+count+"개는 총"+sum+"원 입니다");
		
		if(count>=5) {
			sum*=0.9;
			System.out.println("5개 이상이면 10프로 DC됨");
			System.out.println("실제구입가격: "+sum+"원");
		}
		

	}

}
