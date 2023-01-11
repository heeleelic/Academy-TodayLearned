package day0111;

import java.util.Scanner;

/*throws : 호출한 영역에게 예외 처리를 던져버린다.
 *throw : 강제로 예외를 발생시킨다. */

public class Exception_14 {
	
	
	public static void scoreInput() throws Exception{ //실제로 호출하는 메인에서 처리해라.
		
		Scanner sc=new Scanner(System.in);
		
		int score;
		
		//점수가 0~100 사이가 아니라면 Exception 강제 발생시키기
		System.out.println("점수를 입력하세요.");
		score=sc.nextInt();
		
		
		if(score<0 || score>100) {
			throw new Exception("점수가 잘못되었습니다.");
		} else System.out.println("당신의 점수는 "+score+"점입니다.");
		
		
	}
	
	public static void main(String[] args) {
		
		
		/*System.out.println("안녕하세요...");
		System.out.println("3초 뒤 헤어집시다...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("안녕히 계세요.");*/
		
		
		try {
			scoreInput();
		} catch (Exception e) {
			System.out.println("오류: "+e.getMessage());
		}

		System.out.println("정상 종료");
	}

}
