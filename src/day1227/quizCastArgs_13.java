package day1227;

public class quizCastArgs_13 {

	public static void main(String[] args) {
		/*main-매개변수를 이용할 것!!!(sangpum,su,dan)
		 * 상품명: 아이폰14
		 * 수량: 2개
		 * 단가: 1400000원
		 * 총금액: 2800000*/
		
		
		//변수
		String sangpum = new String(args[0]);
		int su = Integer.parseInt(args[1]);
		int dan = Integer.parseInt(args[2]);
		
		
		//계산
		
		int chong = su*dan;
		
		//출력
		System.out.println("상품명: "+sangpum);
		System.out.println("수량: "+su+"개");
		System.out.println("단가: "+dan+"원");
		System.out.println("총금액: "+chong+"원");

	}

}
