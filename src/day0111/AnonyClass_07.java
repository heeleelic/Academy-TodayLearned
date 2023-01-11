package day0111;

//추상 클래스
abstract class AbstEx1{
	
	abstract public void dataAdd();
	abstract public void dataList();
}



public class AnonyClass_07 {
	
	
	//익명 내부 클래스 
	
	AbstEx1 abstEx1=new AbstEx1() {
		
		@Override
		public void dataList() {
			System.out.println("데이터를 출력합니다.");
			
		}
		
		@Override
		public void dataAdd() {
			System.out.println("데이터를 추가합니다.");
			
		}
	};
	
	
	

	public static void main(String[] args) {
		
		AnonyClass_07 anony=new AnonyClass_07();
		anony.abstEx1.dataList();
		anony.abstEx1.dataAdd();
		
		

	}

}
