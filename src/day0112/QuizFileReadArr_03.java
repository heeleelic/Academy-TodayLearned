package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class QuizFileReadArr_03 {

	
	/*번호 상품명 수량 단가 총금액*/

	
	public static void calTotal() {
		
		//파일 읽어오기		
		String filename="C:\\sist1226\\file\\coffeeshop.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(filename);
			br=new BufferedReader(fr);
			
			System.out.println("번호\t상품명\t수량\t단가\t총금액");
			System.out.println("-------------------------------------");
			
			int n=0;
			
			//한줄씩 읽기
			while(true) {
				
				String s=br.readLine();
				
				if(s==null) break;
				
				//방법 1.split
				//String[] data=s.split(",");
				
				//String name=data[0];
				//int su=Integer.parseInt(data[1].trim());
				//int dan=Integer.parseInt(data[2].trim());
				//int total=su*dan;				
				
			    //System.out.println(++n+"\t"+name+"\t"+su+"\t"+dan+"\t"+total);
				
				
				//방법 2.StringTokenizer
				StringTokenizer st=new StringTokenizer(s, ",");
				
				String name=st.nextToken();
				int su=Integer.parseInt(st.nextToken().trim());
				int dan=Integer.parseInt(st.nextToken().trim());
				int total=su*dan;
				
				System.out.println(++n+"\t"+name+"\t"+su+"\t"+dan+"\t"+total);
				
				
							
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
	
	
	
	
	
	public static void main(String[] args) {
	
		calTotal();

	}

}
