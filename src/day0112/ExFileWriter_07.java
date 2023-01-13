package day0112;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExFileWriter_07 {

	
	Scanner sc=new Scanner(System.in);
	FileWriter fw;
	static final String FILENAME="C:\\sist1226\\file\\member.txt";
	
	public void dataWrite() {
		
		try {
			
			fw=new FileWriter(FILENAME,true);
			
			//키보드로 이름, 주소, 핸드폰 입력
			System.out.println("이름 입력");
			String name=sc.nextLine();
			
			System.out.println("주소 입력");
		    String addr=sc.nextLine();
		    
		    System.out.println("핸드폰 번호 입력");
		    String hp=sc.nextLine();
			
		    System.out.println("**파일에 정보를 저장했습니다.");
		    
		    //파일 저장
		    fw.write("회원명: "+name+"\n");
		    fw.write("주소: "+addr+"\n");
		    fw.write("핸드폰 번호: "+hp+"\n----------------------\n");
		    
				
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
	
	
	
	public static void main(String[] args) {
		
		ExFileWriter_07 fw7=new ExFileWriter_07();
		fw7.dataWrite();
		
	}

}
