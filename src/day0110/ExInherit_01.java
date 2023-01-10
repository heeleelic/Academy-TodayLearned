package day0110;

//슈퍼 클래스
class MySchool{
	
	public static final String SCHOOLNAME="강남고등학교";
	private String schoolAddr;
	private int countStu;
	private int countTeacher;
	
	//기본 생성자
	public MySchool() {
		this("송파구", 200, 15); //다른 생성자 호출해서 null값 방지 
	}
	
	//아규먼트 생성자
	public MySchool(String schoolAddr,int countStu, int countTeacher) {
		this.schoolAddr=schoolAddr;
		this.countStu=countStu;
		this.countTeacher=countTeacher;
	}

	//게터 세터
	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getCountStu() {
		return countStu;
	}

	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}

	public int getCountTeacher() {
		return countTeacher;
	}

	public void setCountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}

	public static String getSchoolname() {
		return SCHOOLNAME;
	}
	
	//메서드
	public void writeData() {
		System.out.println("학교 주소: "+schoolAddr);
		System.out.println("학생 수: "+countStu);
		System.out.println("선생님 수: "+countTeacher);
	}
		
}

//서브 클래스
class MyStudent extends MySchool{
	
	private String stuName;
	private int score;
	
	//기본 생성자 초깃값 
	public MyStudent() {
		//super() 생략 
		
	}
	
	//아규먼트 생성자
	public MyStudent(String schoolAddr,int countStu, int countTeacher, String stuName, int score) {
		super(schoolAddr, countStu, countTeacher);
		this.stuName=stuName;
		this.score=score;
		
	}
	
	
	
	//게터 세터
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
	//메서드 오버라이딩 
	@Override
	public void writeData() {	
		System.out.println("학교명: "+SCHOOLNAME);
		super.writeData();
		System.out.println("학생 이름: "+stuName);
		System.out.println("점수: "+score);
	}
	
}




public class ExInherit_01 {

	public static void main(String[] args) {
		
		MyStudent stu1=new MyStudent();
		stu1.setStuName("아이린");
		stu1.setScore(50);
		stu1.writeData();
		
		System.out.println();
		MyStudent stu2=new MyStudent("강동구", 150, 20, "이성희", 98);
		stu2.writeData();
		
		
		
		
		
		

	}

}
