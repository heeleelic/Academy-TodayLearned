package day0113;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx_07 {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<>();
		map.put("name", "아이린");
		map.put("age", "30");
		map.put("addr", "서울시 강남구");
		
		//같은 키에 값을 다르게 넣으면 먼저 값은 사라짐
		map.put("name", "장원영");
		
		System.out.println("size: "+map.size());
		
		System.out.println("---키를 알면 값을 얻을 수 있는---");
		System.out.println("name: "+map.get("name"));
		System.out.println("age: "+map.get("age"));
		System.out.println("addr: "+map.get("addr"));
		
		//맵에 없는 키값을 얻고자 하면 null 
		System.out.println("blood: "+map.get("blood"));
		
		
		System.out.println("\n키를 한번에 얻은 후, 값을 얻는 방법");
		Set<String> keySet=map.keySet();
		
		//iterator로 출력
		System.out.println("----------출력 방법 #1");
		Iterator<String> keyIter=keySet.iterator();
		while(keyIter.hasNext()) {
			String key=keyIter.next();
			System.out.println(key+"==>"+map.get(key));
		}
		
		//for-each로 출력 
		System.out.println("----------출력 방법 #2");
		for(String key:keySet) {
			System.out.println(key+"==>"+map.get(key));
		}

	}

}
