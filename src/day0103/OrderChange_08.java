package day0103;

public class OrderChange_08 {

	public static void main(String[] args) {
		
		//배열의 순서바꾸기 연습
		
		int a=10, b=20;
		System.out.println("a="+a+", b="+b);
		
		int temp=a; //a가 빈다
		a=b; //a그릇에 b를 담는다
		b=temp;
		
		System.out.println("a="+a+", b="+b);
		
		
		System.out.println("배열 순서 변경하기=========>");
		int[] a1= {5,7,2};
		
		for(int n:a1) {
			System.out.print(n+" ");
		}
		
		System.out.println("\n5와 2 순서 변경=========>");
		//5와 2 순서 변경
		
		int temp1=a1[0];
		a1[0]=a1[2];
		a1[2]=temp1;
		
		for(int n:a1) {
			System.out.print(n+" ");
		}

	}

}
