package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ExFileReadArr_02 {

	
	public static void fileRead() {
		
		String filename="C:\\sist1226\\file\\info1.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(filename);
			br=new BufferedReader(fr);
			
			System.out.println("**파일 읽기_학생 정보**");
			System.out.println("이름\t학교\t학년");
			System.out.println("----------------------");
			
			
			while(true) {
				
				//한 줄 단위로 읽기
				String s=br.readLine();
				
				//더 이상 읽어올 데이터가 없으면 종료
				if(s==null) break;
				
				//split으로 분리
				//String[] data=s.split(",");
				
				//배열 개수만큼 반복해서 출력
				//System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);
				
				//StringTokenizer로 분리
				StringTokenizer st=new StringTokenizer(s, ",");
				System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"+st.nextToken()+"학년");
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {			
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		

		fileRead();
	}

}
