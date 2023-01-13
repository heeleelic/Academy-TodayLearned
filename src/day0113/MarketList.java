package day0113;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketList {

	//텍스트 파일 주소, Market 담을 리스트, 스캐너 선언
	static final String FILENAME="C:\\sist1226\\file\\market.txt";
	List<Market> list=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	//클래스 객체 생성 시 바로 읽기 메서드 실행하는 기본 생성자
	public MarketList() {
		marketRead();
	}
	
	
	//스캐너로 정보 입력
	public void marketAdd() {
		
		System.out.print("추가할 상품명은? ");
		String sang=sc.nextLine();
		System.out.print("수량은? ");
		int su=Integer.parseInt(sc.nextLine());
		System.out.print("단가는? ");
		int dan=Integer.parseInt(sc.nextLine());
		
		//Market 객체에 정보 담기
		Market market=new Market(sang, su, dan);
		
		//리스트에 market 담기
		list.add(market);
		System.out.println("상품 정보가 입력되었습니다.");
	}
	
	
	//텍스트 파일 쓰기
	public void marketWrite() {
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(FILENAME);
			
			//리스트에 담긴 market 내용을 얻어서 쓰기
			for(Market market:list) {
				String s=market.getSangName()+","+market.getSu()+","+market.getDan()+"\n";
				fw.write(s);	
			}
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	//텍스트 파일 읽기 
	public void marketRead() {
		
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true) {
				
				String market=br.readLine(); //한 줄씩 읽어오기
				if(market==null) break;
				
				//구분 기호로 분리하기
				String[] d=market.split(",");
				
				String sang=d[0];
				int su=Integer.parseInt(d[1]);
				int dan=Integer.parseInt(d[2]);
				int total=su*dan; //★ Market 생성자에서 total=su*dan 했는데 또 하는 이유??
				
				//Market 새 객체에 저장하기
				Market m=new Market(sang, su, dan);
				
				//리스트에 m 담기
				list.add(m);
				
				
			}
			
			System.out.println("파일에서 총 "+list.size()+"개의 목록을 가져옵니다.");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("저장된 상품이 존재하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(br!=null) br.close();
					if(fr!=null) fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
	
	
	
	//콘솔창에 정보 출력
	public void marketAllDatas() {
		
		if(list.size()==0) {
			System.out.println("출력할 상품이 없습니다.");
			return; //현재 메서드 종료
		}
			
			System.out.println("**상품 정보**");
			System.out.println("번호\t상품\t수량\t단가\t총금액");
			System.out.println("-------------------------------------------");
			
			for(int i=0;i<list.size();i++) {
				Market m=list.get(i);
				System.out.println((i+1)+"\t"+m.getSangName()+"\t"+m.getSu()+"\t"+m.getDan()+"\t"+m.getTotal());
			}

		}
	
	
	//메인 프로세스 메서드
	public void process() {
		
		int num=0;
		
		while(true) {
			
			System.out.println("1.상품추가 2.상품출력 9.종료");
			num=Integer.parseInt(sc.nextLine());

			
			if(num==1) this.marketAdd();
			else if(num==2) this.marketAllDatas();
			else if(num==9) {
				System.out.println("저장 후 종료합니다.");
				this.marketWrite();
			}
			
			System.out.println();
			
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		MarketList m1=new MarketList();
		m1.process();
		

	}

}
