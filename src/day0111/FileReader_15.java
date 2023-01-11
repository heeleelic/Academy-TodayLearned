package day0111;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*FileReader : 경로(String)에 있는 파일을 로드한다.
 *BufferedReader : 버퍼를 사용해서 파일을 읽는다.*/

public class FileReader_15 {
		
	public static void read() {
		
		//경로 표시(String)
		String fileName="C:\\sist1226\\file\\memo1.txt";
		
		FileReader fr=null;
		BufferedReader br=null;
		
		//파일 로드
		try {
			
			fr=new FileReader(fileName); //FileReader로 열어서
			System.out.println("파일을 열었습니다.");
			br=new BufferedReader(fr); //BufferedReader로 읽는다
			
			//여러 줄을 읽어야 하므로 while문을 사용한다
			while(true) {
				
				String s=br.readLine();
				
				//마지막 줄일 경우 null 값을 읽는다. null일 경우 while문 탈출.
				if(s==null) break;
				
				//한 줄씩 출력한다 
				System.out.println(s);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		} finally {
		try {
			br.close();
			fr.close(); //닫을 때는 역순으로 닫기
			System.out.println("파일 자원을 모두 닫았습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		
	}
	

	public static void main(String[] args) {
		
		//저장된 txt파일을 읽어오자.
		
		read();
		System.out.println("정상 종료");

	}

}
