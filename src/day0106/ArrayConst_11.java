package day0106;

class Info{
	
	//이름,혈액형,나이
	
	private String name;
	private String btype;
	private int age;
	
	// 3개짜리 생성자
	
	public Info(String name,String btype,int age) {
		this.name=name;
		this.btype=btype;
		this.age=age;
	}
	
	// 제목
	
	public static void title() {
		System.out.println("이름\t혈액형\t나이");
		System.out.println("=====================");
	}
	
	
	// 출력
	
	public void print() {
		System.out.println(name+"\t"+btype+"\t"+age+"세");
		
	}
	
	
	
}


public class ArrayConst_11 {

	public static void main(String[] args) {
		
		Info[] person= {
				new Info("아이린", "B", 31),
				new Info("슬기", "A", 29),
				new Info("웬디", "O", 29)
				
		};
		
		Info.title();
		for(Info a:person) {
			a.print();
		}
		
		
		
		
	}

}
