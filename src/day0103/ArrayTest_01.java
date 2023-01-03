package day0103;

public class ArrayTest_01 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; //선언과 할당
		
		arr1[1]=10;
		arr1[4]=34;
		
				
		//for문
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+": "+arr1[i]);
		}
		
		//for each문
		for(int a: arr1) {
			System.out.println(a);
		}
				
		System.out.println("=================");
		
		System.out.println("=================");
		
		//선언과 동시에 초기화
		
		int[] arr2 = {23,11,44,55,88,99,100};
		
		
		System.out.println("배열 개수: "+arr2.length);
		System.out.println("#1_출력");
		
		//for문
		for(int i=0;i<arr2.length;i++) {
			System.out.printf("%-5d",arr2[i]);
		}
		System.out.println();
		
		//for each문
		for(int a:arr2) {
			System.out.printf("%-5d",a);
		}
		
		

	}

}
