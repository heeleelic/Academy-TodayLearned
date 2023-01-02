package day0102;

public class ArrayTest_09 {

	public static void main(String[] args) {
		int[] arr=new int[3]; //배열 초기화 
		int[] arr2=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;

		System.out.println("배열 arr의 개수: "+arr.length);
		
		System.out.println("for문 출력");
		//출력1. 반복문 이용해서 (일괄) 출력 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("=============================");
		System.out.println("for each문 출력");
		
		//출력2. for each문 이용해서 일괄 출력 -for(자료형 변수명:배열명)
		for(int a: arr) {
			System.out.println(a);
			
		}
		
		System.out.println("=============================");
		System.out.println("arr2: 초기화 안하고 출력");
		
		//arr2에 초기화 하지 않고 출력하기(for문)
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+"==>"+arr2[i]);
		}
		
		//arr2에 초기화 하지 않고 출력하기(for each문)
		for(int a2:arr2) {
			System.out.println(a2);
		}
	}

}
