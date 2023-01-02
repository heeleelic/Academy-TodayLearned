package day0102;

public class WidthGugu_04 {

	public static void main(String[] args) {
		//구구단을 가로로 출력하기
		//[2단]  [3단]  [4단] ... [9단] -단일 for문
		//2*1=2 3*1=3 ... -다중 for문
		//...
		//2*9=18 ... 
		
//		for(int i=2;i<=9;i++) {
//			System.out.print("["+i+"단]\t");		
//		} 
//		System.out.println();
//		
//		for(int j=1;j<=9;j++) {
//			for(int k=2;k<=9;k++) {
//				System.out.print(k+"*"+j+"="+k*j+"\t");
//			}
//			System.out.println();
//		}
				
		//조금 헷갈려서 다시 해보기!
				
		for(int i=2;i<=9;i++) {
			System.out.print("["+i+"단]\t");
		}
		System.out.println();
					
		for(int j=1;j<=9;j++) {			
			for(int k=2;k<=9;k++) {
				System.out.print(k+"*"+j+"="+k*j+"\t");
			}
			
			System.out.println();			
		}
		
		
		

	}

}
