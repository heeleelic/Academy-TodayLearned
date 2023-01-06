package day0106;

class Shop{
	

	private String product;
	private int price;
	private String color;
	
	//3개 생성자	
	public Shop(String product,int price,String color) {
		this.product=product;
		this.price=price;
		this.color=color;
	}
	
	
	//제목 메서드
	public static void showTilte() {
		System.out.println("상품명\t단가\t색상");
		System.out.println("=======================");
	}
	
	//출력 메서드
	public void printInfo() {
		System.out.println(product+"\t"+price+"원"+" "+color);
		
	}

	}



public class ArrayConst_10 {

	public static void main(String[] args) {
		
		Shop[] shops= {
				new Shop("갤럭시폴더",12000000,"화이트"),
				new Shop("아이폰14",14000000,"그린"),
				new Shop("아이폰13",9500000,"레드"),
				new Shop("소니폰",9200000,"블랙"),
	};
		
		
		Shop.showTilte();
		
		for(Shop a:shops) {
			a.printInfo();
		}
		
		
		
		
		
	}
}
