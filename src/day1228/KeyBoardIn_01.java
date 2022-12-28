package day1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardIn_01 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;		
		int total;
		double avg;
		
		System.out.println("당신의 이름은?");
		name=br.readLine();
		
		System.out.println("국어점수는?");
		kor = Integer.parseInt(br.readLine());
		
		System.out.println("영어점수는?");
		eng = Integer.parseInt(br.readLine());
		
		System.out.println("수학점수는?");
		mat = Integer.parseInt(br.readLine());
		
		total=kor+eng+mat;
		avg = total/3.0;
		
		System.out.println("======================");
		System.out.println("이름: " + name);
		System.out.println("평균: " + avg);
		
		
		
		
		
	}

}
