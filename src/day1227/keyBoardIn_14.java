package day1227;

import java.util.Scanner;

public class keyBoardIn_14 {

	public static void main(String[] args) {
		// Scanner 문자열이나 숫자를 키보드로 입력받으려할 때 생성 
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("이름을 입력해 주세요==>");
		String name = sc.nextLine(); //한 줄을 문자로 읽어온다
		
		System.out.print("나이를 입력해 주세요==>");
		int age = Integer.parseInt(sc.nextLine()); //숫자로 읽는다 
		
		
		System.out.println("내 이름은 "+name);

		System.out.print("내 나이는 " +age);

	}

}
