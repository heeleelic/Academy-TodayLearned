package day0109;

import java.util.Scanner;


class Emp{
	
	//변수
	private String name;
	private int pay;
	private int famsu;
	private int timesu;
	
	//게터 세터 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamSu() {
		return famsu;
	}
	public void setFamSu(int famsu) {
		this.famsu = famsu;
	}
	public int getTimeSu() {
		return timesu;
	}
	public void setTimeSu(int timesu) {
		this.timesu = timesu;
	}
	
	//가족수당 
	public int getFamilySudang() {
		int n=0;
		if(famsu>=4) n=200000;
		else n=famsu*50000;		
		return n;
	}
	
	//초과수당
	public int getTimeSudang() {
		int m=0;
		if(timesu>=10) m=300000;
		else m=timesu*30000;
		return m;		
	}
	
	//총 급여
	public int getTotalPay() {
		int totalPay=pay+getFamilySudang()+getTimeSudang();
		return totalPay;
	}
	
	//타이틀
	public static void showTitle() {
		System.out.println("**우리회사 직원 급여현황**");
		System.out.println();
		System.out.println("사원명\t급여\t가족수\t초과시간\t가족수당\t시간수당\t총급여");	
		System.out.println("---------------------------------------------------");
	}
	
}


public class QuizEmp_03 {	
	
	//출력 메서드
	public static void print(Emp[] emp) {
		
		Emp.showTitle();
		
		for(Emp e:emp) {
			System.out.println(e.getName()+"\t"+e.getPay()+"\t"+e.getFamSu()+"\t"+e.getTimeSu()+"\t"+e.getFamilySudang()+"\t"+e.getTimeSudang()+"\t"+e.getTotalPay());
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int inwon;
		Emp[] emp; //배열 생성
		
		System.out.println("입력할 직원 수는 몇 명입니까?");
		inwon=Integer.parseInt(sc.nextLine());
		
		
		emp=new Emp[inwon]; //배열 초기화
		

		
		//inwon 수만큼의 데이터 입력 
		for(int i=0;i<inwon;i++) {		
			
			emp[i]=new Emp();
			
			System.out.println("직원의 성함은 무엇입니까?");
			String name=sc.nextLine();
		
			System.out.println("직원의 급여는 얼마입니까?");
			int pay=Integer.parseInt(sc.nextLine());
		
			System.out.println("직원의 가족수는 몇명입니까?");
			int fs=Integer.parseInt(sc.nextLine());
			
			System.out.println("직원의 초과시간 근무는 몇 시간입니까?");
			int ts=Integer.parseInt(sc.nextLine());
			
		//세터로 emp 데이터 넣기
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setFamSu(fs);
			emp[i].setTimeSu(ts);
			
			System.out.println();
		}
		
		
		//출력
		print(emp);
		/*for(Emp s:emp)
		 * print(emp);*/
				
		
		

	}

}
