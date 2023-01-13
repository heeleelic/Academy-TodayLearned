package day0112;

import java.util.StringTokenizer;

public class ExToken_01 {

	public static void main(String[] args) {
		
		//문자열을 특정 기호로 구분하여 분리하는 방법들 
		String str="red,blue,yellow,pink,white,cyan";
		
		//1.split
		System.out.println("===String의 split 이용===");
		String[] arr=str.split(",");
		System.out.println("총 "+arr.length+"개");
		
		for(String a:arr) {
			System.out.print(a+" ");
		}

		//2. StringTokenizer
		System.out.println("\n===StringTokenizer 이용===");
		StringTokenizer st=new StringTokenizer(str, ",");
		System.out.println("총 토큰 수: "+st.countTokens());
		
		//다음 토큰이 있으면 true, 없으면 false
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
		
		
	}
	
	
	

}
