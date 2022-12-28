package day1227;

public class DataType_08 {

	public static void main(String[] args) {
		//묵시적 형변환은 자동으로 결정되는 타입
		//String+int=String
		//double+int=double
		//long+short=long
		//char+int=int
		
		char a='A';//65
		System.out.println(a);
		System.out.println(a+1); //66
		System.out.println((char)(a+1)); //B
		
		//char는 내부적으로 아스키코드값으로 인식
		System.out.println("Happy"+5+6);
		System.out.println("Happy"+(5+6));
		System.out.println('A'+3); //68
		System.out.println('A'+'B'); //65+66=131
		
	}

}
