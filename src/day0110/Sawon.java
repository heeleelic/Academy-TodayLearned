package day0110;


public class Sawon {

	private String sawonName; //사원명 
	private int gibonPay, timeSu, familySu; //기본급, 시간외수당, 가족수당
	
	//아규먼트 생성자	
	public Sawon(String sawonName,int gibonPay,int familySu, int timeSu) {
		this.sawonName=sawonName;
		this.gibonPay=gibonPay;
		this.timeSu=timeSu;
		this.familySu=familySu;
	}
	
		
	//게터 세터
	public String getSawonName() {
		return sawonName;
	}




	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}




	public int getGibonPay() {
		return gibonPay;
	}




	public void setGibonPay(int gibonPay) {
		this.gibonPay = gibonPay;
	}




	public int getTimeSu() {
		return timeSu;
	}




	public void setTimeSu(int timeSu) {
		this.timeSu = timeSu;
	}




	public void setFamilySu(int familySu) {
		this.familySu = familySu;
	}



	//가족수당
	public int getFamilySudang() {
		int familySudang=0;
		if(familySu>=3) familySudang=70000;
		else familySudang=50000;
		return familySudang;
	}
	
	//시간외수당
	public int getTimeSudang() {
		int timeSudang=0;
		if(timeSu>=5) timeSudang=100000;
		else timeSudang=timeSu*20000;
		return timeSudang;
	}
	
	//총 급여
	public int getTotalPay() {
		int totalPay=(int)((getGibonPay()+getFamilySudang()+getTimeSudang())*0.9);		
		return totalPay;		
	}
	
	//타이틀 출력
	public static void printTitle() {
		System.out.println("사원명\t기본급\t가족수당\t시간외수당\t실수령액");
	}
	
	//출력 메서드 
	public void printInfo() {
		System.out.println(getSawonName()+"\t"+getGibonPay()+"\t"+getFamilySudang()+"\t"+getTimeSudang()+"\t"+getTotalPay());
	}

}
