package day0111;

import java.io.IOException;
import java.io.InputStream;

public class Exception_13 {

	public static void main(String[] args) {
		
		
		InputStream is=System.in; // 콘솔에서 입력받기 위한 스트림
		
		int n=0;
		
		System.out.println("한 글자를 입력하세요.");
		
		try {
			n=is.read(); //1byte만 읽을 수 있다. 2byte인 한글 한 글자는 읽을 수 없다. 
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("오류: "+e.getMessage());
		}
		
		System.out.println("3초 뒤 출력합니다.");
		
		try {
			Thread.sleep(3000); //1sec=1000
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} 

		System.out.println("입력 값: "+(char)n);
	}

}
