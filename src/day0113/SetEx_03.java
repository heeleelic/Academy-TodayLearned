package day0113;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetEx_03 {

	public static void main(String[] args) {
		
		//Set, Random 이용해서 난수 발생(1~45) 6개 출력
		
		Random r=new Random();
		Set<Integer> set=new HashSet<>();
		
		while(true) {
			
			int n=r.nextInt(45)+1;
			set.add(n);
			
			if(set.size()==6)
				break;
			
		}
		
		//출력 #1
		System.out.println("------------for/each 출력");
		for(int a:set) {
			System.out.printf(a+" ");
		}
		System.out.println();
		
		//출력 #2 (오름차)
		Object[] arr=set.toArray();
		Arrays.sort(arr);
		System.out.println("------------for 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.printf(arr[i]+" ");
		}
		
		
		
		
		
	}

}
