package day1227;

public class PrintfTest_05 {

	public static void main(String[] args) {
		//문자열을 구성해서 출력하는 printf
		//문자열 뒤에 따라오는 데이터를 순서대로 배치
		//정수:%d, 실수:%f, 문자:%c, 문자열:%s
		
		int num1=10,num2=20;
		int num3=num1+num2;
		
		//print 출력
		System.out.println(num1+"+"+num2+"="+num3);
		
		//printf 출력
		System.out.printf("num1의 값은 %d,num2의 값은 %d,num3의 값은 %d입니다\n",num1,num2,num3);
		
		
		/*Q.printf를 이용해서 출력할것!!!문자열내 특수문자 이용해서 줄내림도 해주세요...
		 * 
		 * 안녕하세요 제이름은 홍길동 입니다
		 * 나이는 25세 입니다 */
		
		String name="홍길동";
		int age=25;
		
		System.out.printf("안녕하세요 제이름은 %s입니다 \n나이는 %d입니다",name,age);

	}

}
