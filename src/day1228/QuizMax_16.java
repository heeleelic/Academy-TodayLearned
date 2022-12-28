package day1228;

import java.util.Scanner;

public class QuizMax_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 숫자를 입력하시오");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();		
		int max = 0;
		
		if((a>b)&&(a>c)) max=a;
		else if((b>a)&&(b>c)) max=b;
		else if((c>a)&&(c>b)) max=c;
		
		System.out.println("max="+max);
		
		

	}

}
