package day0112;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class QuizFileEnd {
	
	//파일에 저장 sangpum.txt
	//상품명, 수량, 단가를 입력받아서 아이폰14,2,1400000 이런 식으로
	
	String fileName="C:\\sist1226\\file\\sangpum.txt";
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	Scanner sc=new Scanner(System.in);
	
	
	
	//1. 저장 메서드
	public void input() {
		
		//상품명, 수량, 단가 입력
		
		System.out.println("상품명을 입력하세요.");
		String name=sc.nextLine();
		System.out.println("수량을 입력하세요.");
		int su=Integer.parseInt(sc.nextLine().trim());
		System.out.println("단가를 입력하세요.");
		int dan=Integer.parseInt(sc.nextLine().trim());
		
		
		//입력한 내용 저장		
		try {
			fw=new FileWriter(fileName,true);
			
			fw.write(name+","+su+","+dan+"\n");
			System.out.println("정보가 입력되었습니다.");
				
			
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
	
	
	//2. 출력 메서드
	public void output() {
		
			System.out.println("[번호]\t[기기종류]\t[가격]");
		
			try {
				fr=new FileReader(fileName);
				br=new BufferedReader(fr);
				
				int num=0;
				
				while(true) {
					
				String s=br.readLine();
				if(s==null) break;
				
				String[] data=s.split(",");
				String name=data[0];
				int su=Integer.parseInt(data[1]);
				int dan=Integer.parseInt(data[2]);
				
				
				System.out.println(++num+" "+name+"\t"+su+"\t"+dan);
				
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		
				
	}
	
	 public int getMenu() {
		 int number=0;
		 
		 System.out.println("1.정보 입력     2.정보 출력     0.종료");
		 number=Integer.parseInt(sc.nextLine());
		 
		 
		 return number;
	 }
	
	public static String process(QuizFileEnd quizFileEnd) {
		while(true) {
			
			int click=quizFileEnd.getMenu();
			
			switch (click) {
			case 1:
				quizFileEnd.input();
				break;
			case 2:
				quizFileEnd.output();
				break;				
			case 0: 
				System.out.println("실행을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("유효하지 않은 입력입니다.");
				break;
			}
			
		}
	}
	

	public static void main(String[] args) {
		
		//1.상품 추가  2. 전체상품 출력  3.파일 삭제(if 파일이 존재한다면 삭제)  0. 종료
		
		QuizFileEnd qfe=new QuizFileEnd();
		process(qfe);
		
		
	}

}
