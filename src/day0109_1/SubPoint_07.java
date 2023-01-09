package day0109_1;

import day0109.Point_07;

public class SubPoint_07 extends Point_07{
	
	String msg;
	
	
	public SubPoint_07() {
		//super(); 생략된 상태 
		System.out.println("서브_기본 생성자");
	}
	
	public SubPoint_07(int x,int y,String msg) {		
		super(x, y);
		this.msg=msg;
	}
	
	//메서드 오버라이딩
	@Override
	public void write() {
		System.out.println("서브_아규먼트 생성자");
		super.write();
		System.out.println("메시지: "+msg);
	}
	
	
	public static void main(String[] args) {
		
		SubPoint_07 sp=new SubPoint_07();
		sp.write();
		
		SubPoint_07 sp2=new SubPoint_07(3, 3,"개힘들다...");
		sp2.write();
		
		

	}

}
