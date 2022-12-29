package day1229;

import java.util.Scanner;

public class ScanGuguDan_12 {

	public static void main(String[] args) {
		//구구단 입력 후 해당 단을 출력해보기 
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("원하는 단을 입력하세요.");
		int i = sc.nextInt();
		
		for(int j=1;j<=9;j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
		
		
		
		
		

	}

}
