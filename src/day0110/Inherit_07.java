package day0110;


interface Color{
	String INITCOLOR="white";
	public void showColor();
}


class Red implements Color{

	@Override
	public void showColor() {
		System.out.println("빨간색");
		System.out.println("현재 색상은 "+INITCOLOR);
		
	}
	
}

class Blue implements Color{

	@Override
	public void showColor() {
		System.out.println("파란색");
		System.out.println("현재 색상은 "+INITCOLOR);
		
	}
	
}

class Green implements Color{

	@Override
	public void showColor() {
		System.out.println("초록색");
		System.out.println("현재 색상은 "+INITCOLOR);
		
	}
	
}








public class Inherit_07 {
	
	
	public static void show(Color color) {
		color.showColor();
	}

	

	public static void main(String[] args) {
	
		System.out.println("<메소드 인자로 인터페이스 호출해서 자식 클래스 생성>");
		show(new Red());
		show(new Blue());
		show(new Green());
		
		System.out.println();
		
		System.out.println("<다형성을 이용해 자식 클래스 생성>");
		Color color=new Red();
		color.showColor();
		
		Color color2=new Blue();
		color2.showColor();
		
		Color color3=new Green();
		color3.showColor();
		
		
		
		
		
		
		
	}

}
