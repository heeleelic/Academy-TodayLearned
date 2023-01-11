package day0111;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*score.txt를 읽고 개수, 총점, 평균 출력
 *throws, throw 만들기*/

public class FileException_16 {
	
	public static void scoreInput() throws IOException, FileNotFoundException{
		
		String filename="C:\\sist1226\\file\\score.txt";
		
		FileReader fr=null;
		BufferedReader br=null;
		int cnt=0;
		int total=0;
		double avg=0;
		
		fr=new FileReader(filename);
		System.out.println("파일을 정상적으로 열었습니다.");
					
		br=new BufferedReader(fr);
		
		while (true) {
			
			String s=br.readLine();
			if(s==null) break;
			
			//문자열을 정수로 변환해서 개수, 합계 구하기			
			cnt++; //읽은 개수
			total+=Integer.parseInt(s); //합계		
			
		}		
		br.close();
		fr.close();
		
		//평균 구하기
		avg=(double)total/cnt;
		
		System.out.println("개수: "+cnt);
		System.out.println("총점: "+total);
		System.out.printf("평균: %.2f\n",avg);
			
	}
	
	public static void main(String[] args) {
		
		try {
			scoreInput();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("***정상 종료***");
		

	}

}
