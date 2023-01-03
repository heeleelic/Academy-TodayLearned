package day0103;

public class QuizSort_11 {

	public static void main(String[] args) {
		//
		
		
		String[] names= {"이효리","김삼순","진","슈가","유재석"};
		int[] ages= {40,33,27,28,52};
		
		//이름을 오름차순으로 출력하세요.
		//나이는 어떻게 따라가지??? 따라가졌어 ㅠㅠㅠㅠㅠㅠㅠ 나 너무 잘했다!!!!!!!!!!!
		
		for(int i=0;i<names.length-1;i++) {
			
			for(int j=i+1;j<names.length;j++) {
				if(names[i].compareTo(names[j])>0) {
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
					
					int temp2=ages[i];
					ages[i]=ages[j];
					ages[j]=temp2;
				}
			}
		}
				
		
		System.out.printf("번호\t이름\t나이\n");
		System.out.println("-------------------");
		
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+"\t"+names[i]+"\t"+ages[i]);
			
		}
		
		
		

	}

}
