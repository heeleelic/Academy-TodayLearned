package day0113;

import java.util.Iterator;
import java.util.Vector;

public class ListEx_04 {

	public static void main(String[] args) {
		
		Vector<String> list=new Vector<>();
		
		System.out.println("초기 할당 크기는? "+list.capacity());
		System.out.println("초기 데이터 개수는 0이겠지 : "+list.size());
		
		list.add("슈붕");
		list.add("슈붕");
		list.add("슈붕");
		list.add("팥붕");
		list.add("팥붕");
		list.add("슈붕");
		
		System.out.println("데이터 개수 변경 : "+list.size());
		
		//출력 #1 for문
		System.out.println("\n---------출력 1-for문");
		for(int i=0;i<list.size();i++) {
			String s=list.get(i); //for문 출력시 .get 메서드 사용!!!
			System.out.printf(s+" ");
		}
		
		//출력 #2 iterator
		System.out.println("\n---------출력 2-iterator문");
		Iterator<String> bbang=list.iterator();
		while(bbang.hasNext()) {
			System.out.printf(bbang.next()+" ");
		}
		
		//출력 #3 for-each문
		System.out.println("\n---------출력 3-for/each문");
		for(String s:list) {
			System.out.printf(s+" ");			
		}
		
		//출력 #4 Object[]
		System.out.println("\n---------출력 4-Object[]문");
		Object[] ob=list.toArray();
		for(int i=0;i<ob.length;i++) {
			String s=(String)ob[i];
			System.out.printf(s+" ");
		}
				

	}

}
