package day0109;

//super
class Shop{
	
	private String sangpum;
	private int su;
	
	//null값 방지용 기본 생성자 
	public Shop() {
		sangpum="딸기";
		su=5;
		//this("딸기",5); 해서 아규먼트 생성자 호출도 가능하다. 
	}
	
	//아규먼트 생성자
	public Shop(String sangpum,int su) {
		this.sangpum=sangpum;
		this.su=su;
	}
	
	//출력 메서드 
	public void writeShop() {
		System.out.println("상품명: "+sangpum);
		System.out.println("수량: "+su);
	}
	
}

//sub
class MySangPum extends Shop{
	
	private int price;
	
	public MySangPum() {
		price=1000;
	}
	
	public MySangPum(String sangpum,int su,int price) {
		super(sangpum, su); //생성자는 무조건 슈퍼 클래스꺼 먼저 적기! 
		this.price=price;
	}
	
	@Override
	public void writeShop() {
		System.out.println("단가: "+price);
		super.writeShop();		
	}
}



public class QuizInherit_09 {

	public static void main(String[] args) {
		
		
		MySangPum mine=new MySangPum();
		mine.writeShop();
		
		System.out.println();
		
		MySangPum mine2=new MySangPum("오렌지", 10, 1200);
		mine2.writeShop();

	}

}
