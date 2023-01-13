package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class QuizSawonFile_05 {

	/*가족수당=가족수*50000
	 * 시간수당=시간수*25000
	 * 총급여=가본급+가족수당+시간수당
	 * 번호 사원명 기본급 가족수 초과근무시간 가족수당 시간수당 총급여
	 * ------------------------------------------------*/
	
	public static void payRead() {
		
		
		String filename="C:\\sist1226\\file\\sawon.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(filename);
			br=new BufferedReader(fr);
			
			
			System.out.println("번호\t사원명\t기본급\t가족수\t초과근무\t가족수당\t시간수당\t총급여");
			System.out.println("------------------------------------------------------------------");
			
			
			int i=0;
			
			while(true) {
				
				String s=br.readLine();
				
				if(s==null) break;
				
				
				String[] data=s.split(",");
				
				String name=data[0];
				int gibon=Integer.parseInt(data[1]);
				int family=Integer.parseInt(data[2]);
				int time=Integer.parseInt(data[3]);
				
				int famPay=family*50000;
				int timePay=time*25000;
				int totalPay=gibon+famPay+timePay;
				
				
				NumberFormat nf1=NumberFormat.getInstance();
				String basic=nf1.format(gibon);
				String fam=nf1.format(famPay);
				String tim=nf1.format(timePay);
				String tot=nf1.format(totalPay);
				
				System.out.println(++i+"\t"+name+"\t"+basic+"\t"+family+"\t"+time+"\t"+fam+"\t"+tim+"\t"+tot);
							
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
		// TODO Auto-generated method stub

		
		payRead();
	}

}
