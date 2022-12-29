package day1229;

import java.util.Scanner;

public class ScanEqual_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg;
		
		System.out.println("영어단어를 입력하세요");
		System.out.println("ex)happy,angel,rose,cat,dog");
		msg=sc.nextLine();
		
		System.out.println("입력한 문자열: "+msg);
		
		//비교
		if(msg.equals("happy")) System.out.println("***행복하다");
		else if(msg.equals("angel")) System.out.println("***천사");
		else System.out.println("등록되지 않은 단어입니다");
		
	}

}
