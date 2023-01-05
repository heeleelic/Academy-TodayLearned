package day0105;

public class StaticCounter_04 {
	
	int count=0;
	
	//기본 생성자(new로 객체 만들면 동작)
	public StaticCounter_04() {
		
	count++;
	System.out.println(count);
		
	}
	
	

	public static void main(String[] args) {
		
		StaticCounter_04 c1=new StaticCounter_04(); //1이 나왔다.
		StaticCounter_04 c2=new StaticCounter_04(); //역시 1이 나왔다.
		
		//인스턴스 변수는 서로 다른 메모리 할당받으므로 카운트가 증가하지 않는다.
		//카운트를 증가시키려면 스태틱 변수로 만들어 하나의 메모리를 공유하면 된다. 
		
		//만약 프로젝트 내에서 공통으로 사용해야 할 메서드라면 static 메서드를 만든다. 
		
		

	}

}
