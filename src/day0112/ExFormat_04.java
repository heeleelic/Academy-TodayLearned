package day0112;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExFormat_04 {

	public static void main(String[] args) {
		
		Date date=new Date();
		//System.out.println(date);
		
		//날짜, 시간을 원하는 양식대로 출력
		//HH:24시간, MM:월, mm:분		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		System.out.println(sdf.format(date));
		
		//a:오전/오후 hh:12시간
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		//EEE:요일 월,화 EEEE: 요일 월요일, 화요일, 수요일
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm EEE");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy년 MM월 dd일 EEEE HH분 mm분");
		System.out.println(sdf4.format(date));
		
		
		
	
		
		//숫자를 문자열로 변환하여 출력(소수점 등 지정)
		int money=231242345;
		double num=56.14212;
		
		//화폐 단위와 콤마 제공
		NumberFormat nf1=NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(money));
		
		//콤마 제공
		NumberFormat nf2=NumberFormat.getInstance();
		System.out.println(nf2.format(num));
		System.out.println(nf2.format(money));
		
		
	}

}

