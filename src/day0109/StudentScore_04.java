package day0109;

public class StudentScore_04 {

	//변수
	private String name;
	private int java;
	private int html;
	
	//합계 
	public int getTotal() {
		int total=java+html;
		return total;
	}
	
	
	//평균
	public double getAverage() {
		return getTotal()/2.0;
	}
	
	//평가
	public String getEvaluation() {
		String eval;		
		if(getAverage()>=80) eval="합격";
		else eval="불합격";
		return eval;
	}
	
		
	//게터 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	
	
	
	
	
	
	
}
