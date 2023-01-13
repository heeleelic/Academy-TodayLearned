package day0113;
//리스트에 입력받고 출력하기

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListShop_09 {

	ArrayList<Shop> shops=new ArrayList<>();
	
	
	public void ipgo(){
		
		//스캐너로 입력받기
		Scanner sc=new Scanner(System.in);
		
		System.out.println("상품명을 입력하세요.");
		String sangpum=sc.nextLine();
		System.out.println("수량을 입력하세요.");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("단가를 입력하세요.");
		int dan=Integer.parseInt(sc.nextLine());
		
				
		//입력 받은 값을 리스트에 넣기 
		Shop shop=new Shop();
		shop.setSangpum(sangpum);
		shop.setSu(su);
		shop.setDan(dan);
		shops.add(shop);
		
		System.out.println("데이터가 정상 저장되었습니다.");
		
	}
	
	
	
	
	
	
	public void jego(){
		
		//리스트에 넣은 값 반복해서 출력하기 
		
		System.out.println("<------상품 재고 현황------>");
		System.out.println("No.\t상품명\t수량\t단가\t총금액");
		System.out.println("---------------------------------------------");
		
		for(int i=0;i<shops.size();i++) {
			Shop shopping=shops.get(i);
			int total=shopping.getSu()*shopping.getDan();
			System.out.println((i+1)+"\t"+shopping.getSangpum()+"\t"+shopping.getSu()+"\t"+shopping.getDan()+"\t"+total);
					
		}
		
		
		
	}
	
	public void process() {
		
		//번호 선택 
		
		while(true) {
		System.out.println("수행할 작업을 선택하세요--> 1. 입고 처리    2. 재고 확인   0. 종료");
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1:
			ipgo();
			break;
		case 2:
			jego();
			break;
		case 0:
			System.out.println("실행을 종료합니다.");
			System.exit(0);
		default:
			System.out.println("유효하지 않은 입력입니다.");
			continue;
		}
		}
		
		
	}
	

	public static void main(String[] args) {
	
		ArrayListShop_09 als9=new ArrayListShop_09();
		als9.process();

	}

}
