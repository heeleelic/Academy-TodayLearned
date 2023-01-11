package day0111;

import java.util.Date;

public class NullPointExcep_11 {
	
	Date date; //new Date() 객체 생성하지 않아서 예외. 
	
	public void write() {
		
		int y,m,d;
		
		try {
		y=date.getYear()-1900;
		m=date.getMonth()+1;
		d=date.getDay();
		
		System.out.println(y+"년"+m+"월"+d+"일입니다.");
		} catch (NullPointerException e) {
			System.out.println("객체 생성을 안 했어요."+e.getMessage());
		}
		
	}
		

	public static void main(String[] args) {
		
		
		NullPointExcep_11 np=new NullPointExcep_11();
		np.write();
		
		System.out.println("정상 종료");
		
		
		

	}

}
