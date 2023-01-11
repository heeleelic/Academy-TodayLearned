package day0111;

abstract class AbstEx2{
	
	abstract public void dataAdd();
	abstract public void dataList();
	
}


//상속받은 서브 클래스

class SubAbst extends AbstEx2{

	@Override
	public void dataAdd() {
		System.out.println("데이터를 추가합니다.");
		
	}

	@Override
	public void dataList() {
		System.out.println("데이터를 출력합니다.");
		
	}
	
	
	
}



public class AnonyClass_08 {
	
	
	//익명 내부 클래스
	
	AbstEx2 ab2=new AbstEx2() {
		
		@Override
		public void dataList() {
			System.out.println("회원 목록 출력");
			
		}
		
		@Override
		public void dataAdd() {
			System.out.println("회원 목록 추가");
			
		}
	};
	
	//상속받은 서브 클래스 객체 생성
	SubAbst sub=new SubAbst();
	

	public static void main(String[] args) {
		
		
		AnonyClass_08 eight=new AnonyClass_08();
		
		//익명 내부 클래스로 호출
		eight.ab2.dataAdd();
		eight.ab2.dataList();
		
		//상속받은 서브 클래스로 호출
		eight.sub.dataAdd();
		eight.sub.dataList();
		
		
		
	}

}
