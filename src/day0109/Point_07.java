package day0109;



public class Point_07 {

	protected int x;
	protected int y;
	
	public Point_07() {
		System.out.println("슈퍼_기본 생성자");
	}
	
	public Point_07(int x,int y) {
		System.out.println("슈퍼_아규먼트 생성자");
		this.x=x;
		this.y=y;
	}
	
	public void write() {
		System.out.println("x좌표: "+x+", y좌표: "+y);
	}
	
	
}
