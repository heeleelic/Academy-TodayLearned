package day0106;

/*1.callByValue: 값만 전달받음(int,double...String)
 *2.callByRefence: 배열은 객체로 인식, 주소가 전달됨*/

class Test1{
	String name="lee";
	String addr="seoul";
	
}


public class CallByEx_12 {
	
	
	//1. CallByValue
	public static void changeInt(int n) {
		
		System.out.println("전달받은 점수 값: "+n);
		
		//값 변경
		n=20;
		
	}
	
	
	//2. callByRefence
	public static void changeArray(int[] arr) {
		System.out.println("전달받은 배열");
		for(int a:arr) {
			System.out.println(a);
		}
		
		//값 변경
		arr[2]=90;
	}
	
	
	//3. callByRefence (Test1)
	
	public static void changeTest(Test1 t1) {
		System.out.println("전달받은 Test1 객체 출력");
		System.out.println(t1.name);
		System.out.println(t1.addr);
		
		//값 변경
		t1.name="뉴진스";
		t1.addr="어도어";
	}
	
	
	//4. CallByValue
	public static void changeString(String str) {
	 System.out.println("전달받은 문자열 "+str);
	 
	 //값 변경
	 str="어텐션";
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
			//1.
			int a=50;
			changeInt(a); //50
			
			System.out.println("a의 값이 바뀔까: "+a); 
			//changeInt 메서드에서 n=20으로 변경해도 그대로 50(인자만 반영)
			
			
			
			//2.
			int [] arr= {10,20,30};
			changeArray(arr); //10,20,30
			
			System.out.println("메서드 호출 후 배열 값 확인");
			for(int ar:arr) {
				System.out.println(ar); 
				//changeArray 메서드에서 arr[2]=90으로 변경하니 90으로 변함(배열은 메모리 주소 공유)
			}
			
			
			//3.
			Test1 t1=new Test1();
			changeTest(t1); //lee, seoul
			
			System.out.println(t1.name); //뉴진스
			System.out.println(t1.addr); //어도어
			//changeTest 메서드에서 t1.name="뉴진스",t1.addr="어도어"로 변경하니
			//t1.name과 t1.name도 변함(객체는 메모리 주소 공유) 
			
			
			//4.
			String str="Nice";
			changeString(str); //Nice
			
			System.out.println(str); 
			//changeString 메서드에서 "어텐션"으로 변경해도 그대로 "Nice"(인자만 반영)
	}

}
