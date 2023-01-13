package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class ExFileReadWrite_08 {

	static final String FILENAME="C:\\sist1226\\file\\sungjuk.txt";
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	Scanner sc=new Scanner(System.in);
	
	
	//입력과 출력 중 어떤 걸 선택할지 고르는 메서드
	public int getMenu() {
		
		int num=0;
		
		System.out.println("1.추가      2. 전체 출력      0.종료");
		num=Integer.parseInt(sc.nextLine());
		
		
		
		return num;
	}
	
	
	
	
	
	//정보 입력해서 파일에 저장
	public void sungjukIn() {
		
		//이름과 점수를 입력
		System.out.println("학생명을 입력하세요");
		String name=sc.nextLine();
		System.out.println("점수를 입력하세요");
		int score=Integer.parseInt(sc.nextLine().trim());
		
		try {
			fw=new FileWriter(FILENAME,true);
			
			//입력한 내용 저장하기			
			fw.write(name+"\n");
			fw.write(score+"\n");
			
			System.out.println("저장이 완료되었습니다.");		
			
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
	
	//파일을 읽어서 계산 후 출력	
	public void fileRead() {
		
		//제목 출력
		System.out.println("\t**학생 정보**");
		System.out.println("번호\t이름\t점수\t학점");
		System.out.println("-------------------------------");
		
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			int num=0;
			
			while(true) {
				
				String name=br.readLine();
				
				if(name==null) break;
				
				int score=Integer.parseInt(br.readLine());
				
				char grade=getGrade(score);
				
				System.out.println(++num+"\t"+name+"\t"+score+"\t"+grade);			
				
			}
			
					System.out.println("출력을 완료했습니다=======>");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다. "+e.getMessage());
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
	
	//학점 메서드
	public char getGrade(int score) {
		char ch;
		
		switch (score/10) {
		case 10:
		case 9:
			ch='A';			
			break;
		case 8:
			ch='B';
			break;
		case 7:
			ch='C';
			break;
		case 6:
			ch='D';
		default:
			ch='F';
			break;
		}
		
		return ch;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		//클래스 생성
		ExFileReadWrite_08 erw8=new ExFileReadWrite_08();
		
		
		//반복해서 
		while(true) {
			
			int num=erw8.getMenu(); 
			
			if(num==1) {
				System.out.println("학생 정보를 입력합니다.");
				erw8.sungjukIn();
			}
			else if(num==2) {
				System.out.println("전체 정보를 출력합니다.");
				erw8.fileRead();
			}
			else if(num==0) {
				System.out.println("실행을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("번호 확인 후 다시 입력해주세요.");
			}
			
		}
		
		
	}

}
