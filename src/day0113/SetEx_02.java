package day0113;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx_02 {

	public static void main(String[] args) {
		
		HashSet<Integer> setInt=new HashSet<>();
		setInt.add(5);
		setInt.add(15);
		setInt.add(25);
		setInt.add(35);
		setInt.add(45);
		
		System.out.println("개수? "+setInt.size());
		
		
		//for-each
		System.out.println("\n---------for-each 출력");
		for(int s:setInt) {
			System.out.print(s+" ");
		}
		
		
		//iterator/while/hasNext
		System.out.println("\n----------iterator 출력");
		Iterator<Integer> e=setInt.iterator();
		while(e.hasNext())
			System.out.printf(e.next()+" ");
		
				
		//Object[]/toArray/for
		System.out.println("\n------------Object[] 출력");
		Object[] objects=setInt.toArray();
		for(int i=0;i<objects.length;i++) {
			System.out.printf(objects[i]+" ");
		}
		
		
	}

}
