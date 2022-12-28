package day1228;

import java.util.Scanner;

public class QuizScannerMyInfo_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("이름입력: ");
		String name = sc.nextLine();
		
		System.out.println("태어난 연도: ");
		int year = Integer.parseInt(sc.nextLine());
		
		System.out.println("핸드폰 번호: ");
		String phone = sc.nextLine();
		
		System.out.println("주소: ");
		String address = sc.nextLine();
		
		
		
		
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+(2022-year+1)+"세");
		System.out.println("핸드폰: "+phone);
		System.out.println("주소: "+address);

	}

}
