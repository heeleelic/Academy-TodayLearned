package day0113;

import java.util.ArrayList;

public class ArrayList_06 {

	public static void main(String[] args) {
		
		
		String[] str= {"춘식이","프로도","무지","콘","어피치","튜브"};
		
		//리스트 객체 생성
		ArrayList<String> list=new ArrayList<>();
		
		
		//데이터 담기
		for(String s:str) {
			list.add(s);
		}
		
		//크기 출력
		System.out.println("size: "+list.size());
		
	    //출력 #1
		System.out.println("\n---------------1.for문 출력");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" : "+list.get(i));
		}
		
		//출력 #2
		System.out.println("\n---------------2.for/each 출력");
		for(String s:list) {
			System.out.println(s);
		}
		
		
		

	}

}
