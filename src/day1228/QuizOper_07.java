package day1228;

import java.util.Scanner;

public class QuizOper_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
			
		System.out.println("알바비를 입력하세요...");
		int pay = sc.nextInt();
		
		//678452
		int man = pay/10000; //67
		int chon = (pay/1000)%10; //8		
		int bag = (pay/100)%10; //4
		int sip = (pay/10)%10; //5
		int il = (pay%10); //2
		
		
		

		System.out.println("만원: "+man);
		System.out.println("천원: "+chon);
		System.out.println("백원: "+bag);
		System.out.println("십원: "+sip);
		System.out.println("일원: "+il);
		
	}

}
