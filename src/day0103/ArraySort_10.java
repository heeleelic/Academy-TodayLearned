package day0103;

public class ArraySort_10 {

	public static void main(String[] args) {
		
		//문자열 오름차순 정렬하기
		
		String[] data= {"이승기","유재석","하하","신민아","송혜교","강호동","노홍철"};
		
		System.out.println("<원래 데이터>");
		
		for(String org:data) {
			System.out.print(org+" ");
		}
		
		for(int i=0;i<data.length-1;i++) { //기준 데이터
			 for(int j=i+1;j<data.length;j++) { //비교 데이터 , 기준<비교 해서 음수 나오면 기준이 작다는 뜻. temp 필요없음. 양수 나오면 temp로 바꿈.
				 if(data[i].compareTo(data[j])>0) {
					 String temp=data[i];
					 data[i]=data[j];
					 data[j]=temp;
				 }
			 }
		}
		
		System.out.println();
		System.out.println("<오름차순 데이터>");
		for(String org:data) {
			System.out.print(org+" ");
		}
		
	}

}
