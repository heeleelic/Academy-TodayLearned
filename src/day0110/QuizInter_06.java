package day0110;


interface InterAA{
	public void order();
	
}

interface InterBB{
	public void baedal();
	public void pungga();
}

class InterImpl2 implements InterAA, InterBB{

	@Override
	public void baedal() {
		System.out.println("배달의 민족 주문~");
		
	}

	@Override
	public void pungga() {
		System.out.println("별점 평가");
		
	}

	@Override
	public void order() {
		System.out.println("주문받았습니다.");
		
	}
	
}


public class QuizInter_06 {

	public static void main(String[] args) {
		

		//1. 객체 생성
		
		InterImpl2 impl2=new InterImpl2();
		impl2.order();
		impl2.baedal();
		impl2.pungga();
		
		System.out.println();
		
		
		//2. 다형성 
		
		InterAA impl3= new InterImpl2();
		impl3.order();
		
		InterBB impl4= new InterImpl2();
		impl4.baedal();
		impl4.pungga();
		
	}

}
