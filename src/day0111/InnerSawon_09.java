package day0111;

import java.util.Scanner;

class PayOuter{
	
	private String sawonName; //사원명 
	private int gibonPay; //기본급
	private int timeSu; //시간외수당
	private int familySu; //가족수당
	
	
	//내부 클래스 선언(이제 호출해서 메서드처럼 다룰 수 있다) 
	InputInner input=new InputInner();
	SudangInner output=new SudangInner();
	
	
	//외부 클래스 메서드 -> 내부 클래스를 담아내서, 메인에서 이 메서드만 한번 호출하면 된다.
	public void process() {
		
		//데이터 입력
		input.inputData();
		
		//데이터 출력
		output.writeData();
	}
	
	
	
	class InputInner{
		
		//내부 클래스 메서드
		public void inputData() {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("사원명 입력");
			sawonName=sc.nextLine();
			System.out.println("기본급 입력");
			gibonPay=Integer.parseInt(sc.nextLine());
			System.out.println("초과시간 입력");
			timeSu=Integer.parseInt(sc.nextLine());
			System.out.println("가족 수 입력");
			familySu=Integer.parseInt(sc.nextLine());
		}
		
	}
	
	
	class SudangInner{
		
		//내부 클래스 메서드 
		public int getTimeSudang() {
			return timeSu*20000;
		}
		
		public int getFamilySudang() {
			if(familySu<=3) return 200000;
			else return 300000;
		}
		
		public int getTax() {
			return (int)(gibonPay*0.03);
		}
		
		public int getPay() {
			return gibonPay+getTimeSudang()+getFamilySudang()-getTax();
		}
		
		public void writeData() {
			System.out.println("사원명\t기본급\t초과시간\t초과시간수당\t가족수\t가족수당\t기본급세금공제\t실수령액");
			System.out.println(sawonName+"\t"+gibonPay+"\t"+timeSu+"\t"+getTimeSudang()+"\t"+familySu+"\t"+getFamilySudang()+"\t"+getTax()+"\t"+getPay());
		}
		
		
	}
	
}






public class InnerSawon_09 {

	public static void main(String[] args) {
		

		PayOuter pOuter=new PayOuter();
		
		//방법 1. 외부 클래스의 멤버 메서드로 한번에
		//pOuter.process();
		
		//방법 2. 외부클래스.내부클래스로 직접 
		
		
		PayOuter.InputInner inputInner=pOuter.new InputInner();
		inputInner.inputData();
		
		
		PayOuter.SudangInner sudangInner=pOuter.new SudangInner();
		sudangInner.writeData();
		
	}
	

}
