package day0106;


class Score{
	private String stuName;
	private int java;
	private int oracle;
	
	public static final String TITLE="자바 시험 결과";

	
	//게터 세터
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public static String getTitle() {
		return TITLE;
	}
	
	
	//합계 구하는 메서드
	public int getTotal() {
		
		int total=java+oracle;
		
		return total;
	}
	
	
	//평균 구하는 메서드
	public double getAvg() {
				
		double avg= getTotal()/2.0;
		
		return avg;
	}
	
}







public class QuizTest_06 {

	public static void main(String[] args) {
		
		System.out.println("**Score클래스***");
		System.out.println(Score.TITLE);
		
		Score stu1=new Score();
		stu1.setStuName("박지윤");
		stu1.setJava(67);
		stu1.setOracle(88);
		
		System.out.println("이름: "+stu1.getStuName());
		System.out.println("자바점수: "+stu1.getJava());
		System.out.println("오라클점수: "+stu1.getOracle());
		System.out.println("합계: "+stu1.getTotal());
		System.out.println("평균: "+stu1.getAvg());
	}

}
