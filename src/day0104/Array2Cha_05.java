package day0104;

public class Array2Cha_05 {

	public static void main(String[] args) {
		//2차원 배열
		
		int[][] arr;
		arr=new int[2][3]; //2행 3열 생성
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		
		System.out.println("행의 개수: "+arr.length); //2 (행의 개수)
		System.out.println("0행의 열 개수: "+arr[0].length); //3 (0행의 열의 개수)
		System.out.println("1행의 열 개수: "+arr[1].length); //3 (1행의 열의 개수)
		
		System.out.println("데이터 출력================");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("%d,%d=%2d\t",i,j,arr[i][j]);
			}
		}
		
		//arr.length는 행의 개수, arr[i].length는 열의 개수 
		//2차원 배열은 for문 한번으로는 일단 행밖에 접근할 수 없다.
		//2중 for문 돌려서 열에 접근해야 한다. 
		//행과 열은 각 칸마다 일정한 규칙으로 증감하지만, 대각선은 그냥 구해야 한다. 
		
		System.out.println();
		System.out.println("2차원 배열의 데이터 변경 후 다시 출력하기");
		
		arr[0][1]=5;
		arr[1][0]=9;
		arr[1][2]=6;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("%d,%d=%2d\t",i,j,arr[i][j]);
			}
		}
		

	}

}
