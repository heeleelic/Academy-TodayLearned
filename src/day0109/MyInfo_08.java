package day0109;

//sub
public class MyInfo_08 extends Person_08{

	int age;
	
	public MyInfo_08(String name,String buseo,int age) {
		this.name=name;
		this.buseo=buseo;
		this.age=age;
	}
	
	
	
	@Override
	public void writeInfo() {
		super.writeInfo();
		System.out.println("**자식변수까지 출력**");
		System.out.println("나이: "+age);
	}
	
	
	
	public static void main(String[] args) {
				
		MyInfo_08 mi=new MyInfo_08("이성희", "개발부", 25);
		mi.writeInfo();
		
		
		
		
		
	}

}
