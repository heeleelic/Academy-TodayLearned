package day0105;

public class ExObject_10 {
	
	private String sangpum;
	int su;
	int dan;
	
	static String SHOPNAME="이마트";
	
	public void setSangpum(String sangpum) {
		this.sangpum=sangpum;
	}
	
	public String getSangpum() {
		return sangpum;
	}
	

	public static void main(String[] args) {
		
		ExObject_10 eo=new ExObject_10();
		eo.setSangpum("텀블러");
		
		eo.su=10;
		eo.dan=5000;
			
		System.out.println("상점명: "+SHOPNAME);
		System.out.println("상품명: "+eo.getSangpum());
		System.out.println("수량: "+eo.su+"개");
		System.out.println("단가: "+eo.dan+"원");
		

	}

}
