package day0103;

public class ArrayMax_03 {

	public static void main(String[] args) {
		
		
		int[] data= {2,54,6,78,0,99};
		
		System.out.println("개수: "+data.length);
		
		int max = data[0]; //최댓값,최솟값 초기화는 배열의 첫 원소로 한다.
		int min = data[0];
		
		
		for(int i=0;i<data.length;i++) {
			if(data[i]>max) max = data[i];	
			if(data[i]<min) min = data[i];	
		}


		System.out.println("최댓값: "+max+", 최솟값: "+min);

	}

}
