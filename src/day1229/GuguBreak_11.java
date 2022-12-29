package day1229;

public class GuguBreak_11 {

	public static void main(String[] args) {
		loop: for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==3) break loop;//레이블명을 같이쓰면 2개 이상의 반복문 빠져나가기 가능!
				
				System.out.println(i+"X"+j+"="+i*j);
			}
		}

	}

}
