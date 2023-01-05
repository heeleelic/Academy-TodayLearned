package day0105;


class StuInfo{
	
	private String name;
	private String hp;
	public static final String ADDRESS="seoul";
	
	
	/*public void setName(String name) {
		this.name=name;
	}
	public void getName() {
		System.out.println("이름 1: "+this.name);
	}
	
	public void setHp(String hp) {
		this.hp=hp;
	}
	public void getHp() {
		System.out.println("연락처 1: "+this.hp);
	}*/
	
	public void setData(String name,String hp) {
		this.name=name;
		this.hp=hp;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHp() {
		return hp;
	}
	
	
	public void showInfo() {
		System.out.println("이름: "+this.name+", 번호: "+this.hp);
		
	}
}


public class QuizObTest_12 {

	public static void main(String[] args) {
		
		System.out.println(StuInfo.ADDRESS);
		
		StuInfo stu1=new StuInfo();
		//stu1.setName("이성희");
		//stu1.setHp("010-1234-5678");
		stu1.setData("이성희", "010-1234-5678");
		stu1.showInfo();
		
			
		System.out.println("이름: "+stu1.getName()+", 번호: "+stu1.getHp());
		
		

	}

}
