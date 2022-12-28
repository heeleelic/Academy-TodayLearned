package day1228;

public class OperTest_04 {

	public static void main(String[] args) {
		
		boolean bool=false;
		//디폴트는 false
		
		System.out.println("a="+bool);
		System.out.println("b="+!bool);
		
		
		boolean bool1=5>3; //true
		System.out.println("c="+bool1);
		System.out.println("d="+!(5>3));
		
		//System.out.println("e="+!5); 숫자를 바로 부정할 수는 없다.
		
		//비교연산자: >,<,>=,<=,==,!=(같지 않다)
		//논리연산자: &&(and),||(or),!(부정not)
		
		int a=3,b=3,c=5;
		
		//결과 값을 t, f
		
		System.out.println(a>b); //f
		System.out.println(a==b); //t
		System.out.println(!(a==b)); //f
		System.out.println(a!=b); //f
		System.out.println(a>b&&c>b); //false and true -> false
		System.out.println(a>c||c>b); // false or true -> true
		
		

	}

}
