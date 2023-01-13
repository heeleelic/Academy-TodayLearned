package day0113;

import java.util.List;
import java.util.Vector;

public class ListEx_05 {

	//출력 메서드
	public static void write(String title, List<String> list) {
		
		System.out.println("---->"+title+"<----");
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" : "+list.get(i));
		}
		
	}
		
	public static void main(String[] args) {
		
		String[] data= {"슈붕","팥붕","치즈호떡","씨앗호떡","팥도너츠"};
		
		//배열 데이터를 list에 넣기
		List<String> list=new Vector<>();
		for(String s:data) {
			list.add(s);
		}
		
		write("식당 신장개업 초기 데이터", list);
		
		
		System.out.println("\n1번 인덱스 삭제하기");
		list.remove(0);
		
		write("식당 신장개업 1번 삭제 후 데이터", list);
		
		
		System.out.println("\n국화빵 추가하기");
		list.add("국화빵");
		
		write("식당 신장개업 국화빵 추가 후 데이터", list);
		

		System.out.println("\n팥붕을 김붕으로 변경하기");
		list.set(0, "김붕");
		
		write("식당 신장개업 팥붕->김붕 변경 후 데이터", list);
		
		//전체 삭제
		list.clear();
		
		System.out.println("\n폐업 후 남은 데이터... "+list.size());
		
	}

}
