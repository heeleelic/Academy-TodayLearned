package day0104;

public class Array2Cha_06 {

	public static void main(String[] args) {
		//2차원 배열 할당과 함께 초깃값 선언하기
		
		int[][] arr= {{23,30},{1,5,8},{10,20,30,40}};
		
		System.out.println("총 행 개수: "+arr.length);
		System.out.println("0번 행의 열 개수: "+arr[0].length);
		System.out.println("1번 행의 열 개수: "+arr[1].length);
		System.out.println("2번 행의 열 개수: "+arr[2].length);
		

		
		//System.out.println(arr[0][3]); 없는 번지 수는 error
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("["+i+"]["+j+"]="+arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		
		
		
		//for each문으로 출력
		
		for(int[] a:arr) {
			for(int num:a) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		
	}

}
