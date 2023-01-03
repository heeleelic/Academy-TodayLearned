package day0103;

import java.util.Scanner;

public class ScanArray_02 {

	public static void main(String[] args) {
		
		//5개의 배열을 선언 후 초깃값 입력, 출력 
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번째 값: ");
			arr[i] = sc.nextInt(); 
			sum += arr[i];
		}
		
		System.out.println("합계: "+sum);

	}

}
