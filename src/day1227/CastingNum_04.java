package day1227;

public class CastingNum_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Q. 내이름은 이지민
		 * 자바점수는 80
		 * 오라클점수는 70
		 * 두과목의 합계는 150점 입니다
		 * 변수는 args를 이용해볼것!!!*/
		
		//1.변수선언
		String name=args[0];
		int java=Integer.parseInt(args[1]);
		int oracle=Integer.parseInt(args[2]);
		
		//2.계산
		int total=java+oracle;
		
		//3.출력
		System.out.println("내이름은 "+name);
		System.out.println("자바점수는 "+java);
		System.out.println("오라클점수는 "+oracle);
		System.out.println("두과목의 합계는 "+total+"점 입니다");
	}

}
