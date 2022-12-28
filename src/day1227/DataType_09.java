package day1227;

public class DataType_09 {

	public static void main(String[] args) {

		//메인파라메타값으로 3과목의 점수를 읽어서 java,jsp,spring의 점수를 읽어서 총점과 평균(소수점이하 2자리)로 출력하시오
		//java=88, jsp=77,spring=55
		//총점=220
		//평균=73.33

		
		//1.변수선언
		int java=Integer.parseInt(args[0]);
		int jsp=Integer.parseInt(args[1]);
		int spring=Integer.parseInt(args[2]);
		int count=3;
		
		//2.계산
		int tot=java+jsp+spring;
		
		double avg1=tot/count;  //결과 int
		double avg2=(double)tot/count; 
		
		//3.출력
		System.out.printf("java=%d,jsp=%d,spring=%d\n",java,jsp,spring);
		System.out.println("총점="+tot);
		System.out.printf("평균=%.2f",avg2);
		
		
	
	}

}
