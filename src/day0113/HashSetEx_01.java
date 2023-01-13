package day0113;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx_01 {

	/*컬렉션: 자료구조
	 * (인터페이스or클래스)<자료형> 참조변수명 = new 클래스<자료형>;
	 * 
	 * 컬렉션은 크기가 가변적이다.
	 * 
	 * 1) Set : 중복을 허용하지 않는다. 순서가 없다. 
	 * 2) List : 중복이 허용된다. 순서가 있다.
	 * 3) Map : <key>를 가지고 <value>를 찾는다. */
	
	

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>();
		set1.add("아침운동을 마치니 상쾌하고 졸렵다!");
		set1.add("아침은 씨앗호떡");
		set1.add("아침은 붕어빵");
		set1.add("아침은 단팥도넛");
		set1.add("아침운동을 마치니 상쾌하고 졸렵다!"); //중복되므로 포함 x
		
		System.out.println("개수는? "+set1.size());
		
		//1. 일반적인 for-each문 이용해서 출력할 수 있다.		
		System.out.println("\n출력 #1 for-each문\n");
		for(String s:set1) {
			System.out.println(s);
		}
		
		//2. iterator 객체를 얻은 다음에 반복문(while문)으로 출력할 수 있다. 
		System.out.println("\n출력 #2 iterator\n");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext()) { //데이터가 더 없을 떄까지 반복
			String s=iter.next();
			System.out.println(s);
		}
		
		//3. Object 배열 형으로 for문 돌려 출력할 수 있다.
		System.out.println("\n출력 #3 Object 배열 형으로");
		Object[]ob=set1.toArray();
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);		
		}
		
		//데어터 삭제하기
		set1.clear();
		
		if(set1.isEmpty()) System.out.println("Set 안에 데이터 x");
		else System.out.println("Set 안에 데이터 있다.");
		
		

	}

}
