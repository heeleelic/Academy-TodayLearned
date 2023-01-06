package day0106;

public class MyDateMain_02 {

	public static void main(String[] args) {
	
		//MyDate_02 date=new MyDate_02();
		
		MyDate_02 date=new MyDate_02(2022, 12, 31);
		
		System.out.println("연도: "+date.getYear());
		System.out.println("월: "+date.getMonth());
		System.out.println("일: "+date.getDay());
						
		
		System.out.println("**날짜를 변경했습니다.**");
		date.setYear(2023);
		date.setMonth(1);
		date.setDay(6);
		
		
		System.out.println("연도: "+date.getYear());
		System.out.println("월: "+date.getMonth());
		System.out.println("일: "+date.getDay());
		

	}

}
