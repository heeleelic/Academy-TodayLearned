package day0102;

public class ForStar_03 {
	
	public static void star1(){
		
		//1~5까지 별찍기
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static void star2(){
		
		//열을 행만큼만 반복해서 별찍기
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	public static void star3(){
		
		//거꾸로 별찍기 방법 1
		for(int i=0;i<5;i++) {
			for(int j=1;j<=(5-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//거꾸로 별찍기 방법 2
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	

	public static void main(String[] args) {
		
		star1();
		star2();
		star3();

	}

}
