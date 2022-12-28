package day1227;

public class SpecialChar_01 {

	public static void main(String[] args) {
		// 문자열내에서 특별한 의미로 해석문자_Escape Sequence(\를 이용)
		//\t: 다음탭으로 이동
		//\n: 다음줄로 이동
		//\':따옴표
		//\":쌍따옴표
		//\\:백슬래시
		System.out.print("Apple\t");
		System.out.print("Orange\tMellon");
		System.out.println();
		System.out.println("Apple\""); //Apple"
		System.out.println("Apple\\"); //Apple\
		System.out.println("\"Hello\"");  //"Hello"
		System.out.println("c:\\");   //c:\
		
		
		//Q."예은","종수","재승"
		System.out.println("\"예은\",\"종수\",\"재승\"");

	}

}
