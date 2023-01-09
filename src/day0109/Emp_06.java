package day0109;

//슈퍼 클래스
public class Emp_06 {

	String name;
	int salary;
	
	public Emp_06(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String getEmployee() {
		return name+", "+salary;
	}
	
}
