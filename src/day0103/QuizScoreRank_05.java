package day0103;

public class QuizScoreRank_05 {

	public static void main(String[] args) {
		
		String[] name = {"이우형","이지민","이성희","최보현"};
		int[] java = {77,88,69,98};
		int[] oracle = {99,87,94,89};
		
		int[] total = new int[4];
		double[] avg = new double[4];
		int[] rank = new int[4];
		
		//각 학생들의 점수에 대한 총점, 평균, 등수를 구하여 출력하시오.
		
		//총점, 평균 
		for(int i=0;i<4;i++) {
			total[i]+=java[i]+oracle[i];
			avg[i]=(double)total[i]/2;
		}
		
		
		//등수 
		for(int i=0;i<name.length;i++) {
			
			rank[i]=1;
			
			for(int j=0;j<name.length;j++) {
				if(total[i]<total[j]) rank[i]++;
			}
		}
		
			
		
		System.out.printf("번호\t이름\t자바\t오라클\t총점\t평균\t등수\n");
		System.out.println("---------------------------------------------------");
		

		
		for(int i=0;i<name.length;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+oracle[i]+"\t"+total[i]+"\t"+avg[i]+"\t"+rank[i]+"\n");
			
		}
		


	}

}
