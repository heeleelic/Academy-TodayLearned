package day0109;

//서브 클래스
public class Manager_06 extends Emp_06{

	String depart;
	
	public Manager_06(String name,int Salary,String depart) {
		super(name, Salary);
		this.depart=depart;
	}
	
	//오버라이딩(슈퍼 메서드 재정의)
	@Override
	public String getEmployee() {
		
		return super.getEmployee()+", "+depart; 
	}
}
