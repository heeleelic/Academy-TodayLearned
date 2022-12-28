package day1228;

import java.util.Scanner;

public class IfMaxMin_15 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("2개의 숫자를 입력하시오");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("입력한 두 수: "+x+", "+y);
		int max;
		
		//max=x>y?x:y;
		
		if(x>=y) max=x;
		else max=y;
		
		
		
		System.out.println("두 수 중에 더 큰 값은 "+max+"입니다");
		
		System.out.println(x>y?"첫번째 수가 더 크다":"첫번째 수가 더 작다");
		
		

	}

}
