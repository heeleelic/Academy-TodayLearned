package day0103;

public class OrderChangeArray_09 {

	public static void main(String[] args) {
		
		//배열 데이터 거꾸로 변경하기 (절반을 데칼코마니~)
		
		int[] arr= {5,7,9,13,56,4,77,88,99};
		
		System.out.println("원래 데이터");
		
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
		System.out.println();		
		System.out.println("데칼코마니 데이터로 변경하기");
		
		
		for(int i=0;i<arr.length/2;i++) {
			
			int temp = arr[i];
			
			arr[i] = arr[arr.length-1-i]; //0번과 9번, 1번과 8번, 2번과 7번, 3번과 6번 
			//*arr[0]=arr[10-1-0 =9] / *arr[1]=arr[10-1-1 =8] / *arr[2]=arr[10-1-2 =7] / *arr[3]=arr[10-1-3 =6]
			//*arr[4]=arr[10-1-4 =5] 
			
			arr[arr.length-1-i] = temp;				
					
		}
		
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("데이터를 오름차순으로 변경하기");
		
		//기준 데이터는 0번부터 끝에서 두번째까지 (11과,99와,88과,77과,4와,56과,13과,9와,7과)
		for(int i=0;i<arr.length-1;i++) {
			
			//비교하는 데이터는 기준 다음 값부터 끝까지 (99를,88을,77을,4를,56을,13을,9를,7을,5를)
			for(int j=i+1;j<arr.length;j++) { 
				
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		//이걸 간단하게 하려면 Arrays.sort(arr); 메소드 이용할 수도 있다. 
		
		for(int n:arr) {
			System.out.print(n+" ");
		}
		

	}

}
