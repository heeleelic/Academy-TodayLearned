package day0110;


interface InterA{
	
	public void write();
	public void draw();
	
}

interface InterB extends InterA{
	
	public void play();
	
}

//2개의 인터페이스를 구현한 클래스

class InterImpl implements InterB{

	@Override
	public void write() {
		
		System.out.println("나는 숙제를 합니다");
		
	}

	@Override
	public void draw() {
		
		System.out.println("나는 그림을 그립니다");
		
	}

	@Override
	public void play() {
		
		System.out.println("나는 축구를 합니다");
		
	}

	
	
	
}



public class InterfaceImple_05 {

	public static void main(String[] args) {
		
		
		//1. 서브 클래스로 객체 생성
		InterImpl impl=new InterImpl();
		impl.write();
		impl.draw();
		impl.play();
		
		System.out.println();
				
		//2. 다형성 이용 
		InterB ib=new InterImpl();
		ib.write();
		ib.draw();
		ib.play();

	}

}
