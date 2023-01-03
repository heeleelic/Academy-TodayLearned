package day0102;

public class StringEx_08 {

	public static void main(String[] args) {
		
		//String 클래스의 메소드 공부
		
		String str1="apple";
		String str2="Apple";
		String str3="Have a Nice Day!!!";
		String str4="    Happy Day    ";
		
		//trim 공백제거
		System.out.println("st3의 길이: "+str3.length()); 
		System.out.println("st4의 길이: "+str4.length()); 
		System.out.println("앞뒤 공백 제거 후 str4의 길이: "+str4.trim().length());
		System.out.println("*"+str4+"*");
		System.out.println("*"+str4.trim()+"*");
		
		//문자(character) 추출
		System.out.println("str3에서 0번 문자: "+str3.charAt(0));
		System.out.println("str3에서 7번 문자: "+str3.charAt(7));
		
		//문자열(string) 추출
		System.out.println("str3에서 Nice 추출: "+str3.substring(7, 11));
		System.out.println("str3에서 Have 추출: "+str3.substring(0, 4));
		System.out.println("str3에서 N부터 추출: "+str3.substring(7));
		
		//indexOf
		System.out.println("str3에서 H의 인덱스: "+str3.indexOf('H'));
		System.out.println("str3에서 N의 인덱스: "+str3.indexOf('N'));
		
		//equals 대소문자 비교
		System.out.println("문자열 비교: "+str1.equals(str2));
		System.out.println("문자열 비교: "+str1.equalsIgnoreCase(str2));
		
		//a.compareTo(b) a=b->return 0, a<b->return -차이값, a>b->+차이값 
		//달라지는 곳에서 비교 
		System.out.println(str1.compareTo(str2)); //a와 A 비교, a:97 b:65
		System.out.println(str1.compareTo(str1));
		System.out.println("computer".compareTo("command")); //p와 m 비교
		System.out.println("apple".compareTo("banana")); //a가 b보다 하나 작음, -1
		System.out.println("김".compareTo("이")); 
		System.out.println("a".compareTo("b"));  //a가 b보다 하나 작음, -1
		
		//startsWith,endsWith (boolean)
		System.out.println(str3.endsWith("Day!!!"));//true
		
		//split 문자열 분리
		String str5 = "red,blue,gray,white";
		String[] arr=str5.split(",");
		System.out.println(arr.length);
		
		//int->string
		String a=String.valueOf(100);
		String a2=100+"";
		
		//double->string
		String b=String.valueOf(12.2);
		String b2=12.2+"";
		
		//문자열의 일부 변경
		System.out.println(str3.replace('a', '*'));
	}

}
