package day1229;


public class FactorialEx_09 {

	public static void main(String[] args) {
		
		int result=1;
		for(int i=1;i<=10;i++) {
			result*=i;
			System.out.println(i+"!="+result);
		}	
		
		
		//1~10까지 팩토리얼 구현하기
		//ex_ 1!=.. 2!=.. 3!=..
		
		/*int fac=1;
		for(int i=1;i<11;i++) {
			fac*=i;
			System.out.println(i+"!= "+fac);
		}*/

	}

}
