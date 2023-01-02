package day0102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuizTime {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int input;
		int pCnt=0;
		int nCnt=0;
		
		while(true) {
			System.out.println("숫자 입력");
			input=Integer.parseInt(br.readLine());
			
			if(input==0) break;
			
			if(input>0) pCnt++;
			else nCnt++;
			
		}
		
		System.out.println("양수개수: "+pCnt+"개");
		System.out.println("음수개수: "+nCnt+"개");
		

	}

}
