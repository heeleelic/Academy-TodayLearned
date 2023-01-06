package day0106;

public class MyDate_02 {

	//인스턴스 변수 선언
	
	private int year;
	private int month;
	private int day;
	
	//명시적 생성자를 만들면 기본 생성자는 따로 만들어야 한다
	
	public MyDate_02(int y,int m,int d) {
		year=y;
		month=m;
		day=d;
	}
	
	
	//getter,setter 
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
	
	
}
