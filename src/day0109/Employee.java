package day0109;

public class Employee {
	
	//이름, 기본급, 가족수, 초과근무
	//가족수당=가족수*10000 (가족수가 5명 이상이면 50000)
	//초과수당=초과근무*50000 (초과근무가 6시간 이상이면 300000)
	//총 급여=기본급+가족수당+초과수당
	
	//출력 메서드는 이곳에 작성하기. (데이터 하나 단위)
	
	private String name;
	private int basicPay;
	private int famNum;
	private int overTime;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getFamNum() {
		return famNum;
	}
	public void setFamNum(int famNum) {
		this.famNum = famNum;
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	
	public int getFamNumPlus() {
		int famNumPlus=0;
		if(famNum>=5) famNumPlus=50000;
		else famNumPlus=famNum*10000;
		return famNumPlus;
	}
	
	public int getOverTimePlus() {
		int overTimePlus=0;
		if(overTime>=6) overTimePlus=300000;
		else overTimePlus=overTime*50000;
		return overTimePlus;
	}
	
	public int getTotalPay() {
		return basicPay+getFamNumPlus()+getOverTimePlus();
	}
	
	public static void printTitle() {
		System.out.println("=============2023년 1월 평사원 급여 일람============");
		System.out.println("이름\t기본급\t가족수\t초과근무\t가족수당\t초과수당\t총급여");
	}

	
	public void printInfo() {
		System.out.println(getName()+"\t"+getBasicPay()+"\t"+getFamNum()+"\t"+getOverTime()+"\t"+getFamNumPlus()+"\t"+getOverTimePlus()+"\t"+getTotalPay());
	}

}
