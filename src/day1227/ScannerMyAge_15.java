package day1227;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerMyAge_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		int curYear = cal.get(cal.YEAR); //현재년도		
		
		
		
		
		System.out.println("당신의 이름은?");
		String name = sc.nextLine();
		
		System.out.println("태어난 연도는?");
		int myYear = Integer.parseInt(sc.nextLine()); //출생년도
		
		int age = curYear-myYear+1;
		
		System.out.println(name+"님은 "+myYear+"년생이며, "+age+"세입니다.");
		
		

	}

}
