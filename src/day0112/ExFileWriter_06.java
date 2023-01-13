package day0112;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ExFileWriter_06 {

	public static void fileWrite() {
			
		FileWriter fw=null;
		String fileName="C:\\sist1226\\file\\test1.txt";
		
		try {
			
			fw=new FileWriter(fileName); //내용이 바뀌면 그냥 아예 바뀐다.
			
			//파일에 내용 추가
			fw.write("Have a Nice Day!\n");
			fw.write(new Date().toString());
			
			
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
	
	
	public static void fileWrite2() {
		
		FileWriter fw2=null;
		String filename2="C:\\\\sist1226\\\\file\\\\test6.txt";
		
		try {
			fw2=new FileWriter(filename2,true); //내용이 바뀌면 추가로 적는다.
			
			fw2.write("I'm so hungry...\n");
			fw2.write("-------------------------\n");

						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		fileWrite();
		fileWrite2();

	}

}
