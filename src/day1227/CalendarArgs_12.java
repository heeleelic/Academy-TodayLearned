package day1227;

import java.util.Calendar;

public class CalendarArgs_12 {

	public static void main(String[] args) {
		//변수는 main메서드의 args 이용할 것!!!
		/* 이름: 홍길동 
		 * 태어난 연도: 1997년생
		 * 나이: **세 */
		
		Calendar cal = Calendar.getInstance();
		
		//변수
		String name = args[0];
		int bornYear = Integer.parseInt(args[1]);
		int curYear = cal.get(cal.YEAR);
				
		//계산
		
		int age = curYear-bornYear;
		
		//출력

		System.out.println("이름: "+name+"\n"+"태어난 연도: "+bornYear+"\n"+"나이: "+age+"세");
		
	}

}
